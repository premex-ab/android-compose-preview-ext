package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Gear_Mobile device specifications for Android Compose previews.
 *
 * This extension provides Gear_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GearMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GearMobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=Gear_Mobile, code=GM10, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gear_Mobile, code=GM10, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val GM10 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gear_Mobile, code=GM30, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gear_Mobile, code=GM30, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val GM30 = "spec:width=1080,height=2280,unit=px,dpi=480"

  }
