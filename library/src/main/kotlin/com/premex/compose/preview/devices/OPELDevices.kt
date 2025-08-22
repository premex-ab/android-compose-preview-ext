package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OPEL device specifications for Android Compose previews.
 *
 * This extension provides OPEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OPEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OPEL: Any
  get() = object {
      /** OPEL SMARTJ5-M */
      val SMARTJ5_M = "spec:width=540,height=960,unit=px,dpi=240"

      /** OPEL SMARTKIDS */
      val SMARTKIDS = "spec:width=720,height=1440,unit=px,dpi=320"

  }
