package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SAGI device specifications for Android Compose previews.
 *
 * This extension provides SAGI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SAGI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SAGI: Any
  get() = object {
      /** SAGI E5501 */
      val E5501 = "spec:width=480,height=960,unit=px,dpi=240"

  }
