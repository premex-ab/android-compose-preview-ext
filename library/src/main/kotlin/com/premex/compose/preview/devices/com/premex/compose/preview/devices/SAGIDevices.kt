package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SAGI device specifications for Android Compose previews.
 *
 * This extension provides SAGI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SAGI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SAGI: Any
  get() = object {
      /** DeviceSpec(manufacturer=SAGI, code=E5501, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SAGI, code=E5501, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val E5501 = "spec:width=480,height=960,unit=px,dpi=240"

  }
