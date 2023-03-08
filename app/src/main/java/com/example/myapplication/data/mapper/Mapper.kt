package com.example.myapplication.data.mapper

import com.example.myapplication.data.remote.dto.LoremDto
import com.example.myapplication.domain.model.Lorem
import com.example.myapplication.domain.model.LoremEntity

fun LoremDto.toLorem() = Lorem(body, id, title, userId)
fun LoremDto.toLoremEntity() = LoremEntity(body, id, title, userId)