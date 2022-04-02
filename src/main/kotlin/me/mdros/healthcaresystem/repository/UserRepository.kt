package me.mdros.healthcaresystem.repository

import me.mdros.healthcaresystem.model.user.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {

    @Query("select * from users where user_type = 'USER'", nativeQuery = true)
    fun getAllUsers() : List<User>

    @Query("select * from users where user_type = 'DOCTOR'", nativeQuery = true)
    fun getAllDoctors() : List<User>
}