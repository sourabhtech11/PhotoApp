package com.demo.photoapp.di


import com.demo.photoapp.service.UserServiceApi
import com.demo.photoapp.utility.Constants.Companion.baseUrl
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module(includes = [ViewModelModule::class])
class AppModule {
    @Singleton
    @Provides
    fun provideUserServiceApi(): UserServiceApi {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UserServiceApi::class.java)
    }
}
