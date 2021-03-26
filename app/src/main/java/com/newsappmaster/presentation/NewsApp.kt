package com.newsappmaster.presentation

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


/**
 *
 * All apps that use Hilt  must contain an Application class that is annotated with @HiltAndroidApp
 *  as it triggers Hilt code
 */
@HiltAndroidApp
class NewsApp : Application()