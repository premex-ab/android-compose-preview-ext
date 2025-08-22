package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XTIGI device specifications for Android Compose previews.
 *
 * This extension provides XTIGI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XTIGI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XTIGI: Any
  get() = object {
      /** XTIGI V51 */
      val V51 = "spec:width=540,height=1200,unit=px,dpi=260"

  }
