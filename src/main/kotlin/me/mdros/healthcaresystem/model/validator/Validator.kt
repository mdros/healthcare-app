package me.mdros.healthcaresystem.model.validator

import me.mdros.healthcaresystem.model.appointment.Appointment
import java.util.function.Predicate

interface Validator<T>  {

    fun validate(t : T, predicate : Predicate<T>) : Boolean {
        return predicate.test(t)
    }
}