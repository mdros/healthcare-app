package me.mdros.healthcaresystem.repository

import me.mdros.healthcaresystem.model.user.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
}