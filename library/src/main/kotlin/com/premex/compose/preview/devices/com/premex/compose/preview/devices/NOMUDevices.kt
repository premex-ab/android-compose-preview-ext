package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NOMU device specifications for Android Compose previews.
 *
 * This extension provides NOMU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NOMU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NOMU: Any
  get() = object {
      /** DeviceSpec(manufacturer=NOMU, code=G200, width=720, height=1600, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOMU, code=G200, width=720,
      height=1600, dpi=240, isGoogleDevice=false).code */
      val G200 = "spec:width=720,height=1600,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NOMU, code=M8, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOMU, code=M8, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NOMU, code=S10, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOMU, code=S10, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NOMU, code=S50_Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOMU, code=S50_Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S50_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NOMU, code=T20, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOMU, code=T20, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val T20 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NOMU, code=V31, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOMU, code=V31, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V31 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NOMU, code=V31D, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOMU, code=V31D, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V31D = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NOMU, code=V31E, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOMU, code=V31E, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V31E = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NOMU, code=V58, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOMU, code=V58, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val V58 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
