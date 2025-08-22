package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Timovi device specifications for Android Compose previews.
 *
 * This extension provides Timovi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Timovi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Timovi: Any
  get() = object {
      /** DeviceSpec(manufacturer=Timovi, code=Insignia_Delta_2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Timovi, code=Insignia_Delta_2,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val INSIGNIA_DELTA_2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Timovi, code=Insignia_Lab, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Timovi, code=Insignia_Lab,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val INSIGNIA_LAB = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Timovi, code=Timovi_Infinit_Lite_2, width=480, height=854,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Timovi,
      code=Timovi_Infinit_Lite_2, width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val TIMOVI_INFINIT_LITE_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Timovi, code=Timovi_Infinit_MX, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Timovi, code=Timovi_Infinit_MX,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val TIMOVI_INFINIT_MX = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Timovi, code=Timovi_Vision_PRO, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Timovi, code=Timovi_Vision_PRO,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val TIMOVI_VISION_PRO = "spec:width=480,height=960,unit=px,dpi=240"

  }
