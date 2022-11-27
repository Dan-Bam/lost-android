package com.example.data.remote.datasource

import com.example.data.remote.request.lost.EditLostRequest
import com.example.data.remote.request.lost.LostRequest
import com.example.data.remote.response.lost.LostResponse

interface RemoteLostDataSource {
    suspend fun registerLost(lostRequest: LostRequest)
    suspend fun editLost(lostId: String, editLostRequest: EditLostRequest)
    suspend fun deleteLost(lostId: String)
    suspend fun detailLost(lostId: String): LostResponse
    suspend fun findAll(): List<LostResponse>
    suspend fun findCategory(category: String?, address: String): List<LostResponse>
}