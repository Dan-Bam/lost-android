package com.example.data.repository

import com.example.data.remote.datasource.RemoteLostDataSource
import com.example.data.remote.response.lost.toEntity
import com.example.domain.entity.lost.FindAllEntity
import com.example.domain.repository.LostRepository
import javax.inject.Inject

class LostRepositoryImpl @Inject constructor(
    private val lostDataSource: RemoteLostDataSource
): LostRepository {
    override suspend fun findAll(): List<FindAllEntity> {
        return lostDataSource.findAll().map { it.toEntity() }
    }
}