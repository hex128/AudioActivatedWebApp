package io.hex128.audioactivatedwebapp

import android.webkit.JavascriptInterface

class WebAppInterface internal constructor(private val activity: MainActivity) {

    @JavascriptInterface
    fun wakeUp() {
        activity.initialize()
    }

    @get:JavascriptInterface
    val isExternalPowerConnected: Boolean
        get() = activity.isExternalPowerConnected()
}
