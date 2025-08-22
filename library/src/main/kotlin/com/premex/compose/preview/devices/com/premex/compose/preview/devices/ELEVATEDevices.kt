package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ELEVATE device specifications for Android Compose previews.
 *
 * This extension provides ELEVATE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ELEVATE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ELEVATE: Any
  get() = object {
      /** DeviceSpec(manufacturer=ELEVATE, code=G5, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ELEVATE, code=G5, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val G5 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ELEVATE, code=G55_LITE, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ELEVATE, code=G55_LITE, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val G55_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ELEVATE, code=G58, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ELEVATE, code=G58, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val G58 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ELEVATE, code=G60, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ELEVATE, code=G60, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val G60 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ELEVATE, code=G60X, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ELEVATE, code=G60X, width=1080,
      height=2246, dpi=480, isGoogleDevice=false).code */
      val G60X = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ELEVATE, code=G62, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ELEVATE, code=G62, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val G62 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ELEVATE, code=LUNA_G50, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ELEVATE, code=LUNA_G50, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val LUNA_G50 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ELEVATE, code=V55, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ELEVATE, code=V55, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V55 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ELEVATE, code=V55C, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ELEVATE, code=V55C, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val V55C = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ELEVATE, code=V57, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ELEVATE, code=V57, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V57 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
