package me.mdros.healthcaresystem.model.user

import me.mdros.healthcaresystem.model.PersistableEntity
import javax.persistence.*

@Entity
@Table(name = "users", schema = "public")
@DiscriminatorColumn(
    discriminatorType = DiscriminatorType.STRING,
    name = "user_type")
@DiscriminatorValue("USER")
class User : PersistableEntity() {

    var login: String? = null
    var password: String? = null
    var email: String? = null
    var name: String? = null
    var surname: String? = null

}