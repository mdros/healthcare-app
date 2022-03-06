package me.mdros.healthcaresystem.model.user

import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated

@Entity
class Doctor(var specialisation: Specialisation) : User() {

    @Enumerated(EnumType.STRING)
    override val userType: UserType = UserType.DOCTOR

}