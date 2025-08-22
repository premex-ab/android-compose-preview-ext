package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Moxee device specifications for Android Compose previews.
 *
 * This extension provides Moxee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Moxee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Moxee: Any
  get() = object {
      /** DeviceSpec(manufacturer=Moxee, code=m2307, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Moxee, code=m2307, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val M2307 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Moxee, code=T2310, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Moxee, code=T2310, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val T2310 = "spec:width=800,height=1280,unit=px,dpi=200"

  }
