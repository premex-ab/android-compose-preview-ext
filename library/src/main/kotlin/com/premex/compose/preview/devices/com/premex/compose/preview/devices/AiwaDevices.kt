package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * aiwa device specifications for Android Compose previews.
 *
 * This extension provides aiwa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aiwa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aiwa: Any
  get() = object {
      /** DeviceSpec(manufacturer=aiwa, code=AIWA_Z9_PLUS, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=aiwa, code=AIWA_Z9_PLUS, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val AIWA_Z9_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=aiwa, code=JA2-SMP0601, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=aiwa, code=JA2-SMP0601, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val JA2_SMP0601 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=aiwa, code=JA2-TBA0801, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=aiwa, code=JA2-TBA0801, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val JA2_TBA0801 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=aiwa, code=JA2-TBA1001, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=aiwa, code=JA2-TBA1001, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val JA2_TBA1001 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=aiwa, code=JA2-TBA1002, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=aiwa, code=JA2-TBA1002, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val JA2_TBA1002 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=aiwa, code=JA3-SMP0602, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=aiwa, code=JA3-SMP0602, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val JA3_SMP0602 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=aiwa, code=JA3-TBA0802, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=aiwa, code=JA3-TBA0802, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val JA3_TBA0802 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=aiwa, code=JA3-TBA1005, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=aiwa, code=JA3-TBA1005, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val JA3_TBA1005 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=aiwa, code=JA3-TBA1006-4, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=aiwa, code=JA3-TBA1006-4,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val JA3_TBA1006_4 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=aiwa, code=JA3-TBA1006-6, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=aiwa, code=JA3-TBA1006-6,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val JA3_TBA1006_6 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=aiwa, code=JA3-TBA1007, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=aiwa, code=JA3-TBA1007, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val JA3_TBA1007 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=aiwa, code=JA4-TBA1008, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=aiwa, code=JA4-TBA1008, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val JA4_TBA1008 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=aiwa, code=JA4-TBA1101, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=aiwa, code=JA4-TBA1101, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val JA4_TBA1101 = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
