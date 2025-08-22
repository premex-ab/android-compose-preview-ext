package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Starlight device specifications for Android Compose previews.
 *
 * This extension provides Starlight device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Starlight.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Starlight: Any
  get() = object {
      /** DeviceSpec(manufacturer=Starlight, code=C_Note, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Starlight, code=C_Note, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val C_NOTE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Starlight, code=C_Note_Pro, width=480, height=996, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Starlight, code=C_Note_Pro,
      width=480, height=996, dpi=240, isGoogleDevice=false).code */
      val C_NOTE_PRO = "spec:width=480,height=996,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Starlight, code=Gionee_Star, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Starlight, code=Gionee_Star,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val GIONEE_STAR = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Starlight, code=I_Star_Plus, width=640, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Starlight, code=I_Star_Plus,
      width=640, height=1280, dpi=240, isGoogleDevice=false).code */
      val I_STAR_PLUS = "spec:width=640,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Starlight, code=I_star_two, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Starlight, code=I_star_two,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val I_STAR_TWO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Starlight, code=Milan_2G, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Starlight, code=Milan_2G,
      width=600, height=1280, dpi=240, isGoogleDevice=false).code */
      val MILAN_2G = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Starlight, code=My_Star_X, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Starlight, code=My_Star_X,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val MY_STAR_X = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Starlight, code=Safari, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Starlight, code=Safari, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SAFARI = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Starlight, code=STAR_MIX, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Starlight, code=STAR_MIX,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val STAR_MIX = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Starlight, code=Star_Mix_2, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Starlight, code=Star_Mix_2,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val STAR_MIX_2 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Starlight, code=Star_Plus, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Starlight, code=Star_Plus,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val STAR_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Starlight, code=UMI_G, width=720, height=1280, dpi=272,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Starlight, code=UMI_G, width=720,
      height=1280, dpi=272, isGoogleDevice=false).code */
      val UMI_G = "spec:width=720,height=1280,unit=px,dpi=272"

  }
