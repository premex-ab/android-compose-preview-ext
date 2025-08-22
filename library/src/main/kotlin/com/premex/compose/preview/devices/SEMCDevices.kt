package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SEMC device specifications for Android Compose previews.
 *
 * This extension provides SEMC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SEMC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SEMC: Any
  get() = object {
      /** SEMC LT22i */
      val LT22I = "spec:width=540,height=960,unit=px,dpi=240"

      /** SEMC LT26i */
      val LT26I = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SEMC LT26ii */
      val LT26II = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SEMC LT26w */
      val LT26W = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SEMC LT28h */
      val LT28H = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SEMC ST27i */
      val ST27I = "spec:width=320,height=480,unit=px,dpi=160"

  }
