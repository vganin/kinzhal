@file:Suppress("UNUSED_PARAMETER")

package com.daugeldauge.kinzhal.sample

@DaggerModule
object AppModule {
    @AppScope
    @DaggerProvides
    fun provideContentResolver(@Suppress("UNUSED_PARAMETER") router: Router) = object : ContentResolver {}

    @ScreenId
    @DaggerProvides
    fun provideScreenId() = "screen_id"
}
