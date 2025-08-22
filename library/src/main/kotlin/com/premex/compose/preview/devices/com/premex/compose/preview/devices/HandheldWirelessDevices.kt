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
      /** DeviceSpec(manufacturer=Handheld-Wireless, code=C6, width=720, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Handheld-Wireless, code=C6,
      width=720, height=1440, dpi=280, isGoogleDevice=false).code */
      val C6 = "spec:width=720,height=1440,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Handheld-Wireless, code=X6, width=720, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Handheld-Wireless, code=X6,
      width=720, height=1440, dpi=280, isGoogleDevice=false).code */
      val X6 = "spec:width=720,height=1440,unit=px,dpi=280"

  }
