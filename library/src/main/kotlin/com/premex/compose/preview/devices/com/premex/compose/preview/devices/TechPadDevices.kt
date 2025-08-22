package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TechPad device specifications for Android Compose previews.
 *
 * This extension provides TechPad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TechPad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TechPad: Any
  get() = object {
      /** DeviceSpec(manufacturer=TechPad, code=GamePad, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechPad, code=GamePad, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GAMEPAD = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TechPad, code=i700, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechPad, code=i700, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val I700 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TechPad, code=K13, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechPad, code=K13, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val K13 = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TechPad, code=K13pro, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechPad, code=K13pro, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val K13PRO = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TechPad, code=NOTE_4CAM, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechPad, code=NOTE_4CAM, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val NOTE_4CAM = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TechPad, code=R10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechPad, code=R10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TechPad, code=S6, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechPad, code=S6, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val S6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TechPad, code=TechPad_1032, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechPad, code=TechPad_1032,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TECHPAD_1032 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TechPad, code=TechPad_1032s, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechPad, code=TechPad_1032s,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TECHPAD_1032S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TechPad, code=TechPad_10Y, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechPad, code=TechPad_10Y,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TECHPAD_10Y = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TechPad, code=TechPad_10Z, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechPad, code=TechPad_10Z,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TECHPAD_10Z = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TechPad, code=TechPad_3Gx, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechPad, code=TechPad_3Gx,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TECHPAD_3GX = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TechPad, code=TechPad_716, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechPad, code=TechPad_716,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TECHPAD_716 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TechPad, code=TechPad_9x, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechPad, code=TechPad_9x,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TECHPAD_9X = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TechPad, code=Techpad_Kids_7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechPad, code=Techpad_Kids_7,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TECHPAD_KIDS_7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TechPad, code=X7, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechPad, code=X7, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val X7 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TechPad, code=Z10, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechPad, code=Z10, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val Z10 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=TechPad, code=1016S, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechPad, code=1016S, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val _1016S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TechPad, code=1032, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechPad, code=1032, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val _1032 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TechPad, code=816x, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TechPad, code=816x, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val _816X = "spec:width=800,height=1280,unit=px,dpi=160"

  }
