package me.mdros.healthcaresystem.repository

import me.mdros.healthcaresystem.model.user.Doctor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DoctorRepository : JpaRepository<Doctor, Long> {
}