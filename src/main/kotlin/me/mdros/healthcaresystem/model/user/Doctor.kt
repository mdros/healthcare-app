package me.mdros.healthcaresystem.model.user

import javax.persistence.Entity

@Entity
class Doctor(var specialisation: Specialisation) : User() {
}