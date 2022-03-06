package me.mdros.healthcaresystem.model

import javax.persistence.*

@MappedSuperclass
@Table(name = "users")
abstract class PersistableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
}