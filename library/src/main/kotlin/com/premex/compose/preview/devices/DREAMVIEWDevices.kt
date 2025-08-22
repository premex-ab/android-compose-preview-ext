package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DREAMVIEW device specifications for Android Compose previews.
 *
 * This extension provides DREAMVIEW device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DREAMVIEW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DREAMVIEW: Any
  get() = object {
      /** DREAMVIEW stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

  }
