package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BASICS device specifications for Android Compose previews.
 *
 * This extension provides BASICS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BASICS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BASICS: Any
  get() = object {
      /** BASICS BT1124FW */
      val BT1124FW = "spec:width=1200,height=1920,unit=px,dpi=213"

  }
