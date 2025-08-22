package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XTouch device specifications for Android Compose previews.
 *
 * This extension provides XTouch device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XTouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XTouch: Any
  get() = object {
      /** XTouch XP10_4G */
      val XP10_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** XTouch XP10_Wifi */
      val XP10_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** XTouch XTouch_X */
      val XTOUCH_X = "spec:width=720,height=1440,unit=px,dpi=320"

  }
