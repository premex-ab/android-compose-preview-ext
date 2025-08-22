package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QWILI device specifications for Android Compose previews.
 *
 * This extension provides QWILI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Qwili.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Qwili: Any
  get() = object {
      /** QWILI Pula */
      val PULA = "spec:width=480,height=960,unit=px,dpi=240"

  }
