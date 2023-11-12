@file:JvmName("RegexUtil")

package com.vitanov.multiimagepicker.util

private val GIF_PATTERN = """(.+?).gif$""".toRegex()

fun checkGif(path: String) = path.matches(GIF_PATTERN)
