package com.example.makingapicallswitretrofit.data

import com.example.makingapicallswitretrofit.data.model.Product
import kotlinx.coroutines.flow.Flow

interface ProductsRepo {

    suspend fun getProductsList():Flow<Result<List<Product>>>
}