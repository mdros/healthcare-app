package me.mdros.healthcaresystem.controller

import me.mdros.healthcaresystem.model.user.User
import me.mdros.healthcaresystem.repository.UserRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/users")
class UserController(
    private val userRepository: UserRepository
) {

    @GetMapping
    fun getAllUsers() : List<User> {
        return userRepository.getAllUsers()
    }

    @GetMapping("/doctors")
    fun getAllDoctors() : List<User> {
        return userRepository.getAllDoctors()
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long) : ResponseEntity<User> {
        val user = userRepository.findById(id)
        return if (user.isPresent) ResponseEntity.ok(user.get()) else ResponseEntity.notFound().build()
    }

}