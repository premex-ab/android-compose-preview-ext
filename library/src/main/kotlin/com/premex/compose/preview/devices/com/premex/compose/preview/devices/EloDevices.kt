package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Elo device specifications for Android Compose previews.
 *
 * This extension provides Elo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Elo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Elo: Any
  get() = object {
      /** DeviceSpec(manufacturer=Elo, code=Backpack-4, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elo, code=Backpack-4, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val BACKPACK_4 = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Elo, code=Backpack-4-Value, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elo, code=Backpack-4-Value,
      width=1080, height=1920, dpi=240, isGoogleDevice=false).code */
      val BACKPACK_4_VALUE = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Elo, code=Elo-i3-10Std, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elo, code=Elo-i3-10Std, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ELO_I3_10STD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Elo, code=Elo-i3-15Std, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elo, code=Elo-i3-15Std, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val ELO_I3_15STD = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Elo, code=Elo-i3-22Std, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elo, code=Elo-i3-22Std, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val ELO_I3_22STD = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Elo, code=Elo-i3-PUCK, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elo, code=Elo-i3-PUCK, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val ELO_I3_PUCK = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Elo, code=M50, width=720, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elo, code=M50, width=720,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M50 = "spec:width=720,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Elo, code=10in-I-Series-4, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elo, code=10in-I-Series-4,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val _10IN_I_SERIES_4 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Elo, code=10in-I-Series-4-Value, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elo, code=10in-I-Series-4-Value,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val _10IN_I_SERIES_4_VALUE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Elo, code=15in-I-Series-4, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elo, code=15in-I-Series-4,
      width=1080, height=1920, dpi=240, isGoogleDevice=false).code */
      val _15IN_I_SERIES_4 = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Elo, code=15in-I-Series-4-USBC-V, width=1080, height=1920,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elo,
      code=15in-I-Series-4-USBC-V, width=1080, height=1920, dpi=240, isGoogleDevice=false).code */
      val _15IN_I_SERIES_4_USBC_V = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Elo, code=15in-I-Series-4-USB-C, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elo, code=15in-I-Series-4-USB-C,
      width=1080, height=1920, dpi=240, isGoogleDevice=false).code */
      val _15IN_I_SERIES_4_USB_C = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Elo, code=15in-I-Series-4-Value, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elo, code=15in-I-Series-4-Value,
      width=1080, height=1920, dpi=240, isGoogleDevice=false).code */
      val _15IN_I_SERIES_4_VALUE = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Elo, code=22in-I-Series-4, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elo, code=22in-I-Series-4,
      width=1080, height=1920, dpi=240, isGoogleDevice=false).code */
      val _22IN_I_SERIES_4 = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Elo, code=22in-I-Series-4-Value, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elo, code=22in-I-Series-4-Value,
      width=1080, height=1920, dpi=240, isGoogleDevice=false).code */
      val _22IN_I_SERIES_4_VALUE = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
