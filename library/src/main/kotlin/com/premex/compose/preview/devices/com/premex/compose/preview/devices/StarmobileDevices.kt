package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Starmobile device specifications for Android Compose previews.
 *
 * This extension provides Starmobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Starmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Starmobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=Starmobile, code=PLAY_Click_LTE, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Starmobile, code=PLAY_Click_LTE,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val PLAY_CLICK_LTE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Starmobile, code=UP_Prime, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Starmobile, code=UP_Prime,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val UP_PRIME = "spec:width=720,height=1280,unit=px,dpi=320"

  }
