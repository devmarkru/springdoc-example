package ru.devmark.springdoc.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.devmark.springdoc.dto.PersonDto

@RestController
@RequestMapping("/persons")
@Tag(
    name = "Пользователи",
    description = "Все методы для работы с пользователями системы",
)
class PersonController {
    @GetMapping("/{id}")
    @Operation(summary = "Получить информацию о пользователе по его id")
    fun getPersonById(
        @Parameter(description = "id пользователя")
        @PathVariable("id") personId: Int,

        @Parameter(hidden = true)
        @RequestParam(required = false) flag: Boolean
    ) = PersonDto(
        id = 42,
        surname = "Иванов"
    )

    @GetMapping("/admins")
    @Operation(hidden = true)
    fun getAdmin() = PersonDto(
        id = 1,
        surname = "Петров",
    )
}
