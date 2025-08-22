package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Handheld-Wireless device specifications for Android Compose previews.
 *
 * This extension provides Handheld-Wireless device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HandheldWireless.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HandheldWireless: Any
  get() = object {
      /** Handheld-Wireless C6 */
      val C6 = "spec:width=720,height=1440,unit=px,dpi=280"

      /** Handheld-Wireless X6 */
      val X6 = "spec:width=720,height=1440,unit=px,dpi=280"

  }
