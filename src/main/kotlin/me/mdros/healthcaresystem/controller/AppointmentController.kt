package me.mdros.healthcaresystem.controller

import me.mdros.healthcaresystem.model.appointment.Appointment
import me.mdros.healthcaresystem.model.validator.AppointmentValidator
import me.mdros.healthcaresystem.repository.AppointmentRepository
import org.springframework.format.annotation.DateTimeFormat
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime

@RestController
@RequestMapping("/api/appointments")
class AppointmentController(
    private val appointmentRepository: AppointmentRepository,
    private val appointmentValidator: AppointmentValidator
) {

    @GetMapping
    fun getAllAppointments() : List<Appointment> {
        return appointmentRepository.findAll()
    }

    @GetMapping(params = ["start", "end"])
    fun getAppointmentsFromRange(
        @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) start : LocalDateTime,
        @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) end : LocalDateTime
    ) : List<Appointment> {

        if (start.isAfter(end)) {
            return emptyList()
        }

        return appointmentRepository.findAllByAppointmentDateTimeBetween(start, end)
    }

    @PostMapping
    fun addAppointment(@RequestBody appointment: Appointment) : ResponseEntity<Appointment> {
        if (!appointmentValidator.validate(appointment, AppointmentValidator.NEW_APPOINTMENT_PREDICATE)) {
            return ResponseEntity.badRequest().build()
        }

        val savedAppointment = appointmentRepository.save(appointment)
        return ResponseEntity.accepted().body(savedAppointment)
    }

}