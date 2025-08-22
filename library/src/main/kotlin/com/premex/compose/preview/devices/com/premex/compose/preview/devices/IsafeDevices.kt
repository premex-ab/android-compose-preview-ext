package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * isafe device specifications for Android Compose previews.
 *
 * This extension provides isafe device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Isafe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Isafe: Any
  get() = object {
      /** DeviceSpec(manufacturer=isafe, code=IS520_1, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=isafe, code=IS520_1, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val IS520_1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=isafe, code=IS910_1, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=isafe, code=IS910_1, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val IS910_1 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
