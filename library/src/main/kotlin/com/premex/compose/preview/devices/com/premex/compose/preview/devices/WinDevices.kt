package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Win device specifications for Android Compose previews.
 *
 * This extension provides Win device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Win.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Win: Any
  get() = object {
      /** DeviceSpec(manufacturer=Win, code=M3, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Win, code=M3, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val M3 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Win, code=M5plus, width=720, height=1280, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Win, code=M5plus, width=720,
      height=1280, dpi=300, isGoogleDevice=false).code */
      val M5PLUS = "spec:width=720,height=1280,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=Win, code=N4, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Win, code=N4, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val N4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Win, code=N4plus, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Win, code=N4plus, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val N4PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Win, code=Q9, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Win, code=Q9, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val Q9 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
