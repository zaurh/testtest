package com.example.myapplication.data.remote.dto

import com.example.myapplication.domain.model.Lorem

data class LoremDto(
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int
)

fun LoremDto.toLorem() = Lorem(body, id, title, userId)