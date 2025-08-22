package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IKON device specifications for Android Compose previews.
 *
 * This extension provides IKON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IKON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IKON: Any
  get() = object {
      /** DeviceSpec(manufacturer=IKON, code=capitolhill, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IKON, code=capitolhill, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CAPITOLHILL = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IKON, code=IK-1025, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IKON, code=IK-1025, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val IK_1025 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=IKON, code=IK-1028, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IKON, code=IK-1028, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val IK_1028 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IKON, code=IK-1106, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IKON, code=IK-1106, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val IK_1106 = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IKON, code=IK-7108, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IKON, code=IK-7108, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val IK_7108 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IKON, code=IK-869, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IKON, code=IK-869, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val IK_869 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IKON, code=IK-T808, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IKON, code=IK-T808, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IK_T808 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IKON, code=IK_WA024, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IKON, code=IK_WA024, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val IK_WA024 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IKON, code=IK-WT028i, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IKON, code=IK-WT028i, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val IK_WT028I = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=IKON, code=IK-WT1080, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IKON, code=IK-WT1080, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val IK_WT1080 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IKON, code=IK-WT1088, width=800, height=1280, dpi=170,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IKON, code=IK-WT1088, width=800,
      height=1280, dpi=170, isGoogleDevice=false).code */
      val IK_WT1088 = "spec:width=800,height=1280,unit=px,dpi=170"

      /** DeviceSpec(manufacturer=IKON, code=keoneae, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IKON, code=keoneae, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
