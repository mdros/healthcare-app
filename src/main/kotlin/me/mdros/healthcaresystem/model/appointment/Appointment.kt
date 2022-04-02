package me.mdros.healthcaresystem.model.appointment

import me.mdros.healthcaresystem.model.PersistableEntity
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "appointments")
class Appointment(
    @Column(name = "appointment_date_time")
    val appointmentDateTime : LocalDateTime,
    @Column(name = "doctor_id")
    val doctorId : Long,
    @Column(name = "user_id")
    var userId : Long? = null,
    var reserved : Boolean = false
) : PersistableEntity() {
}