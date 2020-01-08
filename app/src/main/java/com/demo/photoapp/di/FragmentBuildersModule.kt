package com.demo.photoapp.di

import com.demo.photoapp.ui.main.DisplayUserAlbumsFragment
import com.demo.photoapp.ui.main.DisplayUserPhotosFragment
import com.demo.photoapp.ui.main.DisplayUsersFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeDisplayUserFragment(): DisplayUsersFragment

    @ContributesAndroidInjector
    abstract fun contributeDisplayUserAlbumsFragment(): DisplayUserAlbumsFragment

    @ContributesAndroidInjector
    abstract fun contributeDisplayUserPhotosFragment(): DisplayUserPhotosFragment
}
