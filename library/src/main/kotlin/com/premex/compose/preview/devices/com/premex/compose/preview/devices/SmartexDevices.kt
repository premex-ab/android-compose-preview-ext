package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Smartex device specifications for Android Compose previews.
 *
 * This extension provides Smartex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Smartex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Smartex: Any
  get() = object {
      /** DeviceSpec(manufacturer=Smartex, code=M530, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Smartex, code=M530, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val M530 = "spec:width=480,height=960,unit=px,dpi=240"

  }
