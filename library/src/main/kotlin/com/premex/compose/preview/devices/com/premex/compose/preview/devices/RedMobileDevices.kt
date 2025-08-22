package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RedMobile device specifications for Android Compose previews.
 *
 * This extension provides RedMobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RedMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RedMobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=RedMobile, code=Volt_L, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RedMobile, code=Volt_L, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val VOLT_L = "spec:width=480,height=960,unit=px,dpi=240"

  }
