package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Philco device specifications for Android Compose previews.
 *
 * This extension provides Philco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Philco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Philco: Any
  get() = object {
      /** DeviceSpec(manufacturer=Philco, code=anaheim, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Philco, code=anaheim, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ANAHEIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Philco, code=Hit_Max, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Philco, code=Hit_Max, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val HIT_MAX = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Philco, code=Hit_P10, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Philco, code=Hit_P10, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val HIT_P10 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Philco, code=HIT_P10a, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Philco, code=HIT_P10a, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val HIT_P10A = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Philco, code=Hit_P12, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Philco, code=Hit_P12, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val HIT_P12 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Philco, code=Hit_P13, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Philco, code=Hit_P13, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val HIT_P13 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Philco, code=HIT_P8, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Philco, code=HIT_P8, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val HIT_P8 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Philco, code=ikebukuro, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Philco, code=ikebukuro, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Philco, code=PCS01, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Philco, code=PCS01, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val PCS01 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Philco, code=PCS02, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Philco, code=PCS02, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val PCS02 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Philco, code=PTB7PA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Philco, code=PTB7PA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PTB7PA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Philco, code=PTB7QSG_3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Philco, code=PTB7QSG_3G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PTB7QSG_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Philco, code=PTB7R, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Philco, code=PTB7R, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PTB7R = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Philco, code=shinjuku, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Philco, code=shinjuku, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SHINJUKU = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Philco, code=sindorim, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Philco, code=sindorim, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SINDORIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Philco, code=sunnyvale, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Philco, code=sunnyvale, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SUNNYVALE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Philco, code=SW6H, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Philco, code=SW6H, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
