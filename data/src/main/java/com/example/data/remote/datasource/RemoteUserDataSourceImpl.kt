package com.example.data.remote.datasource

import com.example.data.remote.network.UserAPI
import com.example.data.remote.response.user.InfoResponse
import com.example.data.remote.response.user.MyEntryResponse
import com.example.data.util.HttpHandler
import javax.inject.Inject

class RemoteUserDataSourceImpl @Inject constructor(
    private val userAPI: UserAPI
): RemoteUserDataSource {
    override suspend fun myLost(): List<MyEntryResponse> {
        return HttpHandler<List<MyEntryResponse>>()
            .httpRequest { userAPI.myLost() }
            .sendRequest()
    }

    override suspend fun myFound(): List<MyEntryResponse> {
        return HttpHandler<List<MyEntryResponse>>()
            .httpRequest { userAPI.myFound() }
            .sendRequest()
    }

    override suspend fun myInfo(): InfoResponse {
        return HttpHandler<InfoResponse>()
            .httpRequest { userAPI.myInfo() }
            .sendRequest()
    }

    override suspend fun logout() {
        return HttpHandler<Unit>()
            .httpRequest { userAPI.logout() }
            .sendRequest()
    }
}