package com.mgarzondev.vaultlymobile.presentation.utils

import android.os.SystemClock
import android.view.View

fun View.setSafeOnClickListener(onSafeClick: (View) -> Unit) {
    val safeClickInterval = 1000
    var lastClickTime: Long = 0

    this.setOnClickListener {
        if (SystemClock.elapsedRealtime() - lastClickTime < safeClickInterval) {
            return@setOnClickListener
        }
        lastClickTime = SystemClock.elapsedRealtime()
        onSafeClick(it)
    }
}