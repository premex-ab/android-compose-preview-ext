package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Kurio device specifications for Android Compose previews.
 *
 * This extension provides Kurio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kurio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kurio: Any
  get() = object {
      /** DeviceSpec(manufacturer=Kurio, code=Aquaman_10_WIFI, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kurio, code=Aquaman_10_WIFI,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val AQUAMAN_10_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Kurio, code=Hulk_7_KIDS_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kurio, code=Hulk_7_KIDS_WIFI,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val HULK_7_KIDS_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Kurio, code=K01023, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kurio, code=K01023, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K01023 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Kurio, code=K01023US, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kurio, code=K01023US, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K01023US = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Kurio, code=K01524, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kurio, code=K01524, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K01524 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Kurio, code=Phoenix_7_KD, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kurio, code=Phoenix_7_KD,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PHOENIX_7_KD = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Kurio, code=Pixi4-7_WIFI_KD, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kurio, code=Pixi4-7_WIFI_KD,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PIXI4_7_WIFI_KD = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Kurio, code=U3A_10_WIFI_KD, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kurio, code=U3A_10_WIFI_KD,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val U3A_10_WIFI_KD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Kurio, code=U3A_7_WIFI_Refresh_KD, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kurio,
      code=U3A_7_WIFI_Refresh_KD, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val U3A_7_WIFI_REFRESH_KD = "spec:width=600,height=1024,unit=px,dpi=160"

  }
