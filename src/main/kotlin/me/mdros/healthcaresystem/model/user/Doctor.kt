package me.mdros.healthcaresystem.model.user

import javax.persistence.*

@Entity
@DiscriminatorValue("DOCTOR")
class Doctor(@Enumerated(EnumType.STRING) var specialisation: Specialisation) : User() {
}