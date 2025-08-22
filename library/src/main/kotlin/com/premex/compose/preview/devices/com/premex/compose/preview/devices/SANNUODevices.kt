package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SANNUO device specifications for Android Compose previews.
 *
 * This extension provides SANNUO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SANNUO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SANNUO: Any
  get() = object {
      /** DeviceSpec(manufacturer=SANNUO, code=K102, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SANNUO, code=K102, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K102 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SANNUO, code=K108, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SANNUO, code=K108, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K108 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
