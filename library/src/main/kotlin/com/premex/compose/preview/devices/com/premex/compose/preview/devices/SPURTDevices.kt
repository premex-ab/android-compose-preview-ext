package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SPURT device specifications for Android Compose previews.
 *
 * This extension provides SPURT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SPURT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SPURT: Any
  get() = object {
      /** DeviceSpec(manufacturer=SPURT, code=K100, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPURT, code=K100, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val K100 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SPURT, code=K200, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPURT, code=K200, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val K200 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SPURT, code=SPURT_K300, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPURT, code=SPURT_K300, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val SPURT_K300 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SPURT, code=SPURT_K400, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPURT, code=SPURT_K400, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val SPURT_K400 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SPURT, code=SPURT_K500, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPURT, code=SPURT_K500, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val SPURT_K500 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SPURT, code=SPURT_K600, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPURT, code=SPURT_K600, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val SPURT_K600 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SPURT, code=SPURT_K700, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPURT, code=SPURT_K700, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SPURT_K700 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SPURT, code=Spurt_K800, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPURT, code=Spurt_K800, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SPURT_K800 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
