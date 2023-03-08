package com.example.myapplication.data.remote

import com.example.myapplication.data.remote.dto.LoremDto
import retrofit2.http.GET

interface LoremApi {

    @GET("posts")
    suspend fun getPosts(): List<LoremDto>

}