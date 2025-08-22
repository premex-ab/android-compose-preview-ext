package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iBall device specifications for Android Compose previews.
 *
 * This extension provides iBall device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IBall.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IBall: Any
  get() = object {
      /** DeviceSpec(manufacturer=iBall, code=Avid, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBall, code=Avid, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val AVID = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iBall, code=Blaze_V4, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBall, code=Blaze_V4, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val BLAZE_V4 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iBall, code=Gorgeo_4GL, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBall, code=Gorgeo_4GL, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GORGEO_4GL = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iBall, code=iBall_Slide_Brace_XJ, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBall, code=iBall_Slide_Brace_XJ,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val IBALL_SLIDE_BRACE_XJ = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iBall, code=iBall_Slide_Cleo_S9, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBall, code=iBall_Slide_Cleo_S9,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val IBALL_SLIDE_CLEO_S9 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iBall, code=iBall_Slide_Dazzle_i7, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBall,
      code=iBall_Slide_Dazzle_i7, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val IBALL_SLIDE_DAZZLE_I7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iBall, code=Imprint_4G, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBall, code=Imprint_4G, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val IMPRINT_4G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=iBall, code=iT-KSA0003, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBall, code=iT-KSA0003, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val IT_KSA0003 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=iBall, code=iT-KSA0012, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBall, code=iT-KSA0012, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val IT_KSA0012 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=iBall, code=iT-KSA0066, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBall, code=iT-KSA0066, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val IT_KSA0066 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=iBall, code=Nova_4G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBall, code=Nova_4G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val NOVA_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iBall, code=Perfect_10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBall, code=Perfect_10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PERFECT_10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iBall, code=Slide_Dazzle_3500, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBall, code=Slide_Dazzle_3500,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SLIDE_DAZZLE_3500 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iBall, code=Slide_Elan_3x32, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBall, code=Slide_Elan_3x32,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SLIDE_ELAN_3X32 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iBall, code=Slide_Elan_4G2_Plus, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBall, code=Slide_Elan_4G2_Plus,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SLIDE_ELAN_4G2_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iBall, code=Slide_Majestic_01, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBall, code=Slide_Majestic_01,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SLIDE_MAJESTIC_01 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iBall, code=Slide_Nimble_4GF, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBall, code=Slide_Nimble_4GF,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SLIDE_NIMBLE_4GF = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=iBall, code=Slide_Skye_03, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBall, code=Slide_Skye_03,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SLIDE_SKYE_03 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iBall, code=Slide_Wings_4GP, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBall, code=Slide_Wings_4GP,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SLIDE_WINGS_4GP = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=iBall, code=Snap_4G2, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBall, code=Snap_4G2, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val SNAP_4G2 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=iBall, code=Spirit_X2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBall, code=Spirit_X2, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val SPIRIT_X2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iBall, code=Twinkle_i5, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBall, code=Twinkle_i5, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val TWINKLE_I5 = "spec:width=600,height=1024,unit=px,dpi=213"

  }
