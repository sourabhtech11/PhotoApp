package com.demo.photoapp.service

import com.demo.photoapp.model.UserAlbums
import com.demo.photoapp.model.UserPhotos
import com.demo.photoapp.model.UsersDetails
import retrofit2.Response
import retrofit2.http.GET

interface UserServiceApi {

    @GET("users")
    suspend fun getUsersDataResponse(): Response<List<UsersDetails>>

    @GET("albums")
    suspend fun getUserAlbumsResponse(): Response<List<UserAlbums>>

    @GET("photos")
    suspend fun getUserPhotosResponse(): Response<List<UserPhotos>>
}