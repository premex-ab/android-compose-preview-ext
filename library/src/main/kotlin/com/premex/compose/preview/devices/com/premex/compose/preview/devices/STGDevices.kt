package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * STG device specifications for Android Compose previews.
 *
 * This extension provides STG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.STG.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.STG: Any
  get() = object {
      /** DeviceSpec(manufacturer=STG, code=STG_A1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STG, code=STG_A1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val STG_A1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STG, code=STG_A1_Pro, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STG, code=STG_A1_Pro, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val STG_A1_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=STG, code=STG_A2_Pro, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STG, code=STG_A2_Pro, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val STG_A2_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STG, code=STG_B10, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STG, code=STG_B10, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val STG_B10 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STG, code=STG_C10, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STG, code=STG_C10, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val STG_C10 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STG, code=STG_K10, width=720, height=1560, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STG, code=STG_K10, width=720,
      height=1560, dpi=360, isGoogleDevice=false).code */
      val STG_K10 = "spec:width=720,height=1560,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=STG, code=STG_P10, width=480, height=1014, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STG, code=STG_P10, width=480,
      height=1014, dpi=220, isGoogleDevice=false).code */
      val STG_P10 = "spec:width=480,height=1014,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=STG, code=STG_S1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STG, code=STG_S1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val STG_S1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STG, code=STG_S10, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STG, code=STG_S10, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val STG_S10 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STG, code=STG_S20, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STG, code=STG_S20, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val STG_S20 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STG, code=STG_S30, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STG, code=STG_S30, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val STG_S30 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STG, code=STG_X1, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STG, code=STG_X1, width=1080,
      height=2246, dpi=480, isGoogleDevice=false).code */
      val STG_X1 = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=STG, code=STG_X2, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STG, code=STG_X2, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val STG_X2 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STG, code=STG_X3, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STG, code=STG_X3, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val STG_X3 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
