package com.klezovich.springdataplayground.entity.repository

import com.klezovich.springdataplayground.entity.ToDo
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ToDoRepository : CrudRepository<ToDo, Long>
