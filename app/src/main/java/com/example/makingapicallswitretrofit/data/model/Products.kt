package com.example.makingapicallswitretrofit.data.model

data class Products(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int,
)