package ru.devmark.springdoc.controller

import io.swagger.v3.oas.annotations.Hidden
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

@Hidden
@RestController
@RequestMapping("/balances")
class HiddenController {

    @GetMapping("/{personId}")
    fun getBalanceByPersonId(
        @PathVariable personId: Int,
    ) = BigDecimal("1000000")
}