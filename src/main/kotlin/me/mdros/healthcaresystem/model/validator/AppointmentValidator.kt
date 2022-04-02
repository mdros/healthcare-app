package me.mdros.healthcaresystem.model.validator

import me.mdros.healthcaresystem.model.appointment.Appointment
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.util.function.Predicate

@Component
class AppointmentValidator : Validator<Appointment> {

    companion object {
        val NEW_APPOINTMENT_PREDICATE: Predicate<Appointment> = isValidNewAppointment()

        private fun isValidNewAppointment(): Predicate<Appointment> {
            return Predicate {
                it.appointmentDateTime.isAfter(LocalDateTime.now()) &&
                        it.userId == null &&
                        !it.reserved
            }
        }
    }

}