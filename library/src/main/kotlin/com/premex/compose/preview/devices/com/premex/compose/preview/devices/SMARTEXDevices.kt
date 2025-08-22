package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SMARTEX device specifications for Android Compose previews.
 *
 * This extension provides SMARTEX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SMARTEX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SMARTEX: Any
  get() = object {
      /** DeviceSpec(manufacturer=SMARTEX, code=M520, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMARTEX, code=M520, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val M520 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SMARTEX, code=M700, width=480, height=996, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMARTEX, code=M700, width=480,
      height=996, dpi=240, isGoogleDevice=false).code */
      val M700 = "spec:width=480,height=996,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SMARTEX, code=P600, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMARTEX, code=P600, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val P600 = "spec:width=480,height=960,unit=px,dpi=240"

  }
