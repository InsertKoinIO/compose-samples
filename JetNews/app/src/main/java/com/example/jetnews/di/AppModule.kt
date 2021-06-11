package com.example.jetnews.di

import com.example.jetnews.data.interests.InterestsRepository
import com.example.jetnews.data.interests.impl.FakeInterestsRepository
import com.example.jetnews.data.posts.PostsRepository
import com.example.jetnews.data.posts.impl.FakePostsRepository
import org.koin.dsl.module

val appModule = module {
    single<PostsRepository> { FakePostsRepository() }
    single<InterestsRepository> { FakeInterestsRepository() }
}