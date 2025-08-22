package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NASCO device specifications for Android Compose previews.
 *
 * This extension provides NASCO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NASCO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NASCO: Any
  get() = object {
      /** DeviceSpec(manufacturer=NASCO, code=NAS-400, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NASCO, code=NAS-400, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val NAS_400 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NASCO, code=NAS-503, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NASCO, code=NAS-503, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val NAS_503 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NASCO, code=NAS-510, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NASCO, code=NAS-510, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val NAS_510 = "spec:width=480,height=960,unit=px,dpi=240"

  }
