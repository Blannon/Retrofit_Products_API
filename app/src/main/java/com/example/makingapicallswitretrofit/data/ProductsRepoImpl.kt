package com.example.makingapicallswitretrofit.data

import com.example.makingapicallswitretrofit.data.model.Product
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException

class ProductsRepoImpl (
    private val api: ProductApi
): ProductsRepo{
    override suspend fun getProductsList(): Flow<Result<List<Product>>> {
        return flow {
            val productsFromAPi = try {
                api.getProductsList()


            } catch (e: IOException){
                e.printStackTrace()
                emit(Result.Error(message = "Error loading products"))
                return@flow

            } catch (e: HttpException){
                e.printStackTrace()
                emit(Result.Error(message = "Error loading products"))
                return@flow
            }catch (e: Exception){
                e.printStackTrace()
                emit(Result.Error(message = "Error loading products"))
                return@flow
            }
            emit(Result.Success(productsFromAPi. products))

        }
    }
}