package com.klezovich.springdataplayground.entity.repository

import com.klezovich.springdataplayground.entity.ToDo
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest
class ToDoRepositoryTest {

    @Autowired
    private lateinit var toDoRepository: ToDoRepository

    @Test
    fun testCanSaveAndLoadEntity() {
        val toDo = ToDo()
        toDo.description = "abc"
        val id = toDoRepository.save(toDo).id

        assertNotNull(id)

        val toDoFromDb = toDoRepository.findById(id!!).get()
        assertEquals("abc", toDoFromDb.description)
    }
}
