package me.mdros.healthcaresystem.repository

import me.mdros.healthcaresystem.model.appointment.Appointment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.time.LocalDateTime

@Repository
interface AppointmentRepository : JpaRepository<Appointment, Long> {

    fun findAllByAppointmentDateTimeBetween(start : LocalDateTime, end : LocalDateTime) : List<Appointment>

}