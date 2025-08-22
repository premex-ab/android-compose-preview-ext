package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Qmobile device specifications for Android Compose previews.
 *
 * This extension provides Qmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Qmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Qmobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=Qmobile, code=i8i, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qmobile, code=i8i, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val I8I = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Qmobile, code=i8i_PRO, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qmobile, code=i8i_PRO, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val I8I_PRO = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Qmobile, code=i8i_Pro_II, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qmobile, code=i8i_Pro_II,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val I8I_PRO_II = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Qmobile, code=Phantom_P1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qmobile, code=Phantom_P1,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val PHANTOM_P1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Qmobile, code=Phantom_P1_Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qmobile, code=Phantom_P1_Pro,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val PHANTOM_P1_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Qmobile, code=Q_Infinity_B, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qmobile, code=Q_Infinity_B,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val Q_INFINITY_B = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Qmobile, code=Q_Infinity_C, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qmobile, code=Q_Infinity_C,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val Q_INFINITY_C = "spec:width=480,height=960,unit=px,dpi=240"

  }
