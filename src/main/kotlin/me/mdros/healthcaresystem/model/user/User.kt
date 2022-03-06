package me.mdros.healthcaresystem.model.user

import me.mdros.healthcaresystem.model.PersistableEntity
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "users")
class User : PersistableEntity() {
    var login: String? = null
    var password: String? = null
    var email: String? = null
    var name: String? = null
    var surname: String? = null
}