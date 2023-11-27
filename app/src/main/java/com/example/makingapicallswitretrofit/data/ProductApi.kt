package com.example.makingapicallswitretrofit.data

import com.example.makingapicallswitretrofit.data.model.Products
import retrofit2.http.GET

interface ProductApi {
    @GET("products")
    suspend fun getProductsList(): Products

    companion object{
        const val BASE_URL ="https://dummyjson.com/"
    }
}