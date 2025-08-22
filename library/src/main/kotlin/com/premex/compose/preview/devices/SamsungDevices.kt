package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Samsung device specifications for Android Compose previews.
 *
 * This extension provides Samsung device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Samsung.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Samsung: Any
  get() = object {
      /** Samsung Galaxy S24 */
      val GALAXY_S24 = "spec:width=1080,height=2340,unit=px,dpi=416"

      /** Samsung Galaxy S24 Ultra */
      val GALAXY_S24_ULTRA = "spec:width=1440,height=3120,unit=px,dpi=505"

  }
