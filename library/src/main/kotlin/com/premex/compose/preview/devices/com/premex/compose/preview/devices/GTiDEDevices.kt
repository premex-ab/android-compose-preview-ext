package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * G-TiDE device specifications for Android Compose previews.
 *
 * This extension provides G-TiDE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GTiDE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GTiDE: Any
  get() = object {
      /** DeviceSpec(manufacturer=G-TiDE, code=G-TiDE_H1_1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-TiDE, code=G-TiDE_H1_1,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val G_TIDE_H1_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-TiDE, code=G-TiDE_H1_2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-TiDE, code=G-TiDE_H1_2,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val G_TIDE_H1_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-TiDE, code=G-TiDE_H1_3, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-TiDE, code=G-TiDE_H1_3,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val G_TIDE_H1_3 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-TiDE, code=G-TiDE_H1_4, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-TiDE, code=G-TiDE_H1_4,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val G_TIDE_H1_4 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-TiDE, code=G-TiDE_H1_4G, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-TiDE, code=G-TiDE_H1_4G,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val G_TIDE_H1_4G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=G-TiDE, code=G-TiDE_P1_2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-TiDE, code=G-TiDE_P1_2,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val G_TIDE_P1_2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=G-TiDE, code=G-TiDE_P1_4G, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-TiDE, code=G-TiDE_P1_4G,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val G_TIDE_P1_4G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=G-TiDE, code=H2R, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-TiDE, code=H2R, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val H2R = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-TiDE, code=Klap_S1, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-TiDE, code=Klap_S1, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val KLAP_S1 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-TiDE, code=Klap_S1_EEA, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-TiDE, code=Klap_S1_EEA,
      width=600, height=1024, dpi=213, isGoogleDevice=false).code */
      val KLAP_S1_EEA = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-TiDE, code=Zeal1, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-TiDE, code=Zeal1, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ZEAL1 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
