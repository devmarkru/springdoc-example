package ru.devmark.springdoc.dto

import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

@Schema(description = "Информация о пользователе")
data class PersonDto(
    @Schema(description = "Идентификатор")
    @Min(1)
    @Max(9999999999)
    val id: Int,

    @Schema(description = "Фамилия")
    @NotBlank
    @Size(min = 1, max = 100)
    val surname: String
)
