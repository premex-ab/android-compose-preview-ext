package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KODAK device specifications for Android Compose previews.
 *
 * This extension provides KODAK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KODAK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KODAK: Any
  get() = object {
      /** DeviceSpec(manufacturer=KODAK, code=KODAK_SMARTWAY_L1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KODAK, code=KODAK_SMARTWAY_L1,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val KODAK_SMARTWAY_L1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KODAK, code=KODAK_SMARTWAY_T2, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KODAK, code=KODAK_SMARTWAY_T2,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val KODAK_SMARTWAY_T2 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KODAK, code=L1_PRO, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KODAK, code=L1_PRO, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val L1_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KODAK, code=marina, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KODAK, code=marina, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KODAK, code=nagata, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KODAK, code=nagata, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KODAK, code=SMARTWAY_F1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KODAK, code=SMARTWAY_F1, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SMARTWAY_F1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KODAK, code=SMARTWAY_L2, width=444, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KODAK, code=SMARTWAY_L2, width=444,
      height=960, dpi=200, isGoogleDevice=false).code */
      val SMARTWAY_L2 = "spec:width=444,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=KODAK, code=SMARTWAY_M2, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KODAK, code=SMARTWAY_M2, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SMARTWAY_M2 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KODAK, code=Smartway_T1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KODAK, code=Smartway_T1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SMARTWAY_T1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KODAK, code=SMARTWAY_T3, width=600, height=1280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KODAK, code=SMARTWAY_T3, width=600,
      height=1280, dpi=280, isGoogleDevice=false).code */
      val SMARTWAY_T3 = "spec:width=600,height=1280,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=KODAK, code=SMARTWAY_X2, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KODAK, code=SMARTWAY_X2, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val SMARTWAY_X2 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
