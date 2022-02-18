package com.klezovich.springdataplayground.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class ToDo(
    @Id
    @GeneratedValue
    var id: Long? = null,
    var description: String? = null
)
