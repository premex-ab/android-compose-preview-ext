package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ACCENT device specifications for Android Compose previews.
 *
 * This extension provides ACCENT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ACCENT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ACCENT: Any
  get() = object {
      /** DeviceSpec(manufacturer=ACCENT, code=C5_PLUS, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACCENT, code=C5_PLUS, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C5_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ACCENT, code=CAMELEON_C5, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACCENT, code=CAMELEON_C5,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val CAMELEON_C5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ACCENT, code=CAMELEON_C6, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACCENT, code=CAMELEON_C6,
      width=540, height=960, dpi=240, isGoogleDevice=false).code */
      val CAMELEON_C6 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ACCENT, code=FAST10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACCENT, code=FAST10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val FAST10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ACCENT, code=Fast10, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACCENT, code=Fast10, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val FAST10 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ACCENT, code=FAST73G, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACCENT, code=FAST73G, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val FAST73G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ACCENT, code=FAST7_3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACCENT, code=FAST7_3G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val FAST7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ACCENT, code=Pearl_A4, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACCENT, code=Pearl_A4, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val PEARL_A4 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACCENT, code=PEARL_A4_Lite, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACCENT, code=PEARL_A4_Lite,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val PEARL_A4_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACCENT, code=PEARL_A4_PLUS, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACCENT, code=PEARL_A4_PLUS,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val PEARL_A4_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACCENT, code=Pearl_A6, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACCENT, code=Pearl_A6, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PEARL_A6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACCENT, code=PEARL_A6, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACCENT, code=PEARL_A6, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val PEARL_A6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACCENT, code=TANK_P55, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACCENT, code=TANK_P55, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TANK_P55 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
