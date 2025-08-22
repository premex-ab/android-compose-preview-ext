package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ASANZO device specifications for Android Compose previews.
 *
 * This extension provides ASANZO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ASANZO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ASANZO: Any
  get() = object {
      /** DeviceSpec(manufacturer=ASANZO, code=ASANZO_A2, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ASANZO, code=ASANZO_A2, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ASANZO_A2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ASANZO, code=S6, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ASANZO, code=S6, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val S6 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ASANZO, code=shibuya, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ASANZO, code=shibuya, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SHIBUYA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ASANZO, code=SW6H, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ASANZO, code=SW6H, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
