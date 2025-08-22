package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PHILCO device specifications for Android Compose previews.
 *
 * This extension provides PHILCO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PHILCO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PHILCO: Any
  get() = object {
      /** DeviceSpec(manufacturer=PHILCO, code=elliniko, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILCO, code=elliniko, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val ELLINIKO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PHILCO, code=ikebukuro, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILCO, code=ikebukuro, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PHILCO, code=P510, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILCO, code=P510, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P510 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PHILCO, code=P610, width=480, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILCO, code=P610, width=480,
      height=960, dpi=220, isGoogleDevice=false).code */
      val P610 = "spec:width=480,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=PHILCO, code=PHILCO_TP7A6, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILCO, code=PHILCO_TP7A6,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PHILCO_TP7A6 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PHILCO, code=PTB8R, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILCO, code=PTB8R, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PTB8R = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PHILCO, code=PTB8R4G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILCO, code=PTB8R4G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PTB8R4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PHILCO, code=stanford, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILCO, code=stanford, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PHILCO, code=SW4H, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILCO, code=SW4H, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PHILCO, code=TP10A332, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILCO, code=TP10A332, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TP10A332 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PHILCO, code=TP10A3N, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILCO, code=TP10A3N, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TP10A3N = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PHILCO, code=TP10A464, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILCO, code=TP10A464, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TP10A464 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PHILCO, code=TP10F, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILCO, code=TP10F, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TP10F = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PHILCO, code=TP7A464, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILCO, code=TP7A464, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TP7A464 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PHILCO, code=TP7A4N, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILCO, code=TP7A4N, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TP7A4N = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PHILCO, code=zhongshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILCO, code=zhongshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
