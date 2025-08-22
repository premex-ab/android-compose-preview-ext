package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ILA device specifications for Android Compose previews.
 *
 * This extension provides ILA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ILA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ILA: Any
  get() = object {
      /** DeviceSpec(manufacturer=ILA, code=C3, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ILA, code=C3, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val C3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ILA, code=E1_Plus, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ILA, code=E1_Plus, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val E1_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ILA, code=E3, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ILA, code=E3, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val E3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ILA, code=ILA_C1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ILA, code=ILA_C1, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ILA_C1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ILA, code=ILA_E1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ILA, code=ILA_E1, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ILA_E1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ILA, code=ILA_R1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ILA, code=ILA_R1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ILA_R1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ILA, code=ILA_X1, width=720, height=1498, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ILA, code=ILA_X1, width=720,
      height=1498, dpi=320, isGoogleDevice=false).code */
      val ILA_X1 = "spec:width=720,height=1498,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ILA, code=ILA_X2, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ILA, code=ILA_X2, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ILA_X2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ILA, code=ILA_X3, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ILA, code=ILA_X3, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val ILA_X3 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ILA, code=R1_Lite, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ILA, code=R1_Lite, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val R1_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

  }
