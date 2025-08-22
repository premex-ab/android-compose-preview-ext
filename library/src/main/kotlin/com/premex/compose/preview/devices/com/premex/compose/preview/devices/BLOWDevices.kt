package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BLOW device specifications for Android Compose previews.
 *
 * This extension provides BLOW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BLOW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BLOW: Any
  get() = object {
      /** DeviceSpec(manufacturer=BLOW, code=BlackTAB7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLOW, code=BlackTAB7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val BLACKTAB7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BLOW, code=BlackTab7_3G_V2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLOW, code=BlackTab7_3G_V2,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val BLACKTAB7_3G_V2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BLOW, code=BlackTAB8_4G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLOW, code=BlackTAB8_4G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BLACKTAB8_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BLOW, code=GPSTAB7_4G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLOW, code=GPSTAB7_4G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GPSTAB7_4G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BLOW, code=KidsTAB10_4G_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLOW, code=KidsTAB10_4G_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val KIDSTAB10_4G_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=BLOW, code=KidsTAB7_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLOW, code=KidsTAB7_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KIDSTAB7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BLOW, code=LaserTAB10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLOW, code=LaserTAB10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val LASERTAB10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BLOW, code=PlatinumTAB10, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLOW, code=PlatinumTAB10,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val PLATINUMTAB10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLOW, code=PlatinumTAB10V11, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLOW, code=PlatinumTAB10V11,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val PLATINUMTAB10V11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BLOW, code=PlatinumTAB10V22, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLOW, code=PlatinumTAB10V22,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val PLATINUMTAB10V22 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=BLOW, code=PlatinumTAB10_4G_V1, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLOW, code=PlatinumTAB10_4G_V1,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val PLATINUMTAB10_4G_V1 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLOW, code=PlatinumTAB10_4G_V2, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLOW, code=PlatinumTAB10_4G_V2,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val PLATINUMTAB10_4G_V2 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLOW, code=PlatinumTAB10_4G_V3, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLOW, code=PlatinumTAB10_4G_V3,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val PLATINUMTAB10_4G_V3 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLOW, code=PlatinumTAB11_4G, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLOW, code=PlatinumTAB11_4G,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val PLATINUMTAB11_4G = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=BLOW, code=PlatinumTAB8_4G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLOW, code=PlatinumTAB8_4G,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val PLATINUMTAB8_4G = "spec:width=800,height=1280,unit=px,dpi=213"

  }
