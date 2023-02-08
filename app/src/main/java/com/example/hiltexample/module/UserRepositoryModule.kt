package com.example.hiltexample.module

import com.example.hiltexample.qualifier.FirebaseQualifier
import com.example.hiltexample.qualifier.SqlQualifier
import com.example.hiltexample.repo.FirebaseRepository
import com.example.hiltexample.repo.SQLRepository
import com.example.hiltexample.repo.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
class UserRepositoryModule {

    @SqlQualifier
    @Provides
    fun providesUserRepository(sqlRepository: SQLRepository): UserRepository {
        return sqlRepository
    }

    @FirebaseQualifier
    @Provides
    fun providesFirebaseRepository(): UserRepository {
        return FirebaseRepository()
    }

}