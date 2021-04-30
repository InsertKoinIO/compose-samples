package com.example.jetnews.di

import com.example.jetnews.data.interests.InterestsRepository
import com.example.jetnews.data.interests.impl.FakeInterestsRepository
import com.example.jetnews.data.posts.PostsRepository
import com.example.jetnews.data.posts.impl.FakePostsRepository
import com.example.jetnews.ui.NavigationViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { NavigationViewModel(get()) }
    single<PostsRepository> { FakePostsRepository() }
    single<InterestsRepository> { FakeInterestsRepository() }
}