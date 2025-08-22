package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hytera device specifications for Android Compose previews.
 *
 * This extension provides Hytera device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hytera.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hytera: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hytera, code=PDC680, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hytera, code=PDC680, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PDC680 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hytera, code=PNC460, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hytera, code=PNC460, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PNC460 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Hytera, code=PNC550, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hytera, code=PNC550, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PNC550 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hytera, code=PNC560, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hytera, code=PNC560, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PNC560 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Hytera, code=PTC680, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hytera, code=PTC680, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PTC680 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
