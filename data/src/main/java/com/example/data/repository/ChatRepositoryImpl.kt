package com.example.data.repository

import com.example.data.remote.datasource.RemoteChatDataSource
import com.example.data.remote.response.chat.toEntity
import com.example.domain.entity.chat.ChatListEntity
import com.example.domain.repository.ChatRepository
import javax.inject.Inject

class ChatRepositoryImpl @Inject constructor(
    private val chatDataSource: RemoteChatDataSource
): ChatRepository {
    override suspend fun chatList(): List<ChatListEntity> {
        return chatDataSource.chatList().map { it.toEntity() }
    }
}