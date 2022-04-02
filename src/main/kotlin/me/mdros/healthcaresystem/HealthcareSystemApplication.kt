package me.mdros.healthcaresystem

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.time.LocalDateTime

@SpringBootApplication
class HealthcareSystemApplication

fun main(args: Array<String>) {
	runApplication<HealthcareSystemApplication>(*args)
}
