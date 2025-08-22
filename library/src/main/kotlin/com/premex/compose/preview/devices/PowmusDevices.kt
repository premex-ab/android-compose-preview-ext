package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * POWMUS device specifications for Android Compose previews.
 *
 * This extension provides POWMUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Powmus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Powmus: Any
  get() = object {
      /** POWMUS L211-EEA */
      val L211_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** POWMUS L30 */
      val L30 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** POWMUS L60 */
      val L60 = "spec:width=800,height=1280,unit=px,dpi=200"

  }
