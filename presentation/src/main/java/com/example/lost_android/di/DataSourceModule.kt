package com.example.lost_android.di

import com.example.data.remote.datasource.RemoteAuthDataSource
import com.example.data.remote.datasource.RemoteAuthDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {
    @Binds
    abstract fun provideAuthDataSource(
        authDataSourceImpl: RemoteAuthDataSourceImpl
    ): RemoteAuthDataSource
}