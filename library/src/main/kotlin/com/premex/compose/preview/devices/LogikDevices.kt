package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Logik device specifications for Android Compose previews.
 *
 * This extension provides Logik device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Logik.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Logik: Any
  get() = object {
      /** Logik ueno */
      val UENO = "spec:width=720,height=1280,unit=px,dpi=213"

  }
