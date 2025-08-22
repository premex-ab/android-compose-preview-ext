package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VERTU device specifications for Android Compose previews.
 *
 * This extension provides VERTU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VERTU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VERTU: Any
  get() = object {
      /** DeviceSpec(manufacturer=VERTU, code=ASTER_P, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VERTU, code=ASTER_P, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ASTER_P = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=VERTU, code=VTL-202101, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VERTU, code=VTL-202101, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val VTL_202101 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=VERTU, code=VTL-202201, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VERTU, code=VTL-202201, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val VTL_202201 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=VERTU, code=VTL-202301, width=1260, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VERTU, code=VTL-202301, width=1260,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val VTL_202301 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=VERTU, code=VTL-202302, width=1188, height=2790, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VERTU, code=VTL-202302, width=1188,
      height=2790, dpi=520, isGoogleDevice=false).code */
      val VTL_202302 = "spec:width=1188,height=2790,unit=px,dpi=520"

  }
