package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CHUWI device specifications for Android Compose previews.
 *
 * This extension provides CHUWI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CHUWI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CHUWI: Any
  get() = object {
      /** DeviceSpec(manufacturer=CHUWI, code=CH108Q, width=1212, height=1940, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHUWI, code=CH108Q, width=1212,
      height=1940, dpi=320, isGoogleDevice=false).code */
      val CH108Q = "spec:width=1212,height=1940,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CHUWI, code=Hi10_XPro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHUWI, code=Hi10_XPro, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HI10_XPRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CHUWI, code=Hi10_XPro_Pad, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHUWI, code=Hi10_XPro_Pad,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val HI10_XPRO_PAD = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CHUWI, code=Hi10_XPro_Pad_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHUWI, code=Hi10_XPro_Pad_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val HI10_XPRO_PAD_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CHUWI, code=Hi9, width=1600, height=2560, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHUWI, code=Hi9, width=1600,
      height=2560, dpi=360, isGoogleDevice=false).code */
      val HI9 = "spec:width=1600,height=2560,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=CHUWI, code=Hi9Air, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHUWI, code=Hi9Air, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val HI9AIR = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CHUWI, code=Hi9Pro, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHUWI, code=Hi9Pro, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val HI9PRO = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CHUWI, code=HiPadPlus, width=1600, height=2176, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHUWI, code=HiPadPlus, width=1600,
      height=2176, dpi=320, isGoogleDevice=false).code */
      val HIPADPLUS = "spec:width=1600,height=2176,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CHUWI, code=HiPadPro, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHUWI, code=HiPadPro, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val HIPADPRO = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CHUWI, code=HipadX, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHUWI, code=HipadX, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val HIPADX = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CHUWI, code=HiPadX, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHUWI, code=HiPadX, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HIPADX = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CHUWI, code=HiPad_11, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHUWI, code=HiPad_11, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val HIPAD_11 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=CHUWI, code=HiPad-Air, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHUWI, code=HiPad-Air, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val HIPAD_AIR = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CHUWI, code=HiPad_Max, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHUWI, code=HiPad_Max, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val HIPAD_MAX = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=CHUWI, code=HiPad_XPro, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHUWI, code=HiPad_XPro, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HIPAD_XPRO = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CHUWI, code=HiPad_XPro_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHUWI, code=HiPad_XPro_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val HIPAD_XPRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=CHUWI, code=Surpad, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHUWI, code=Surpad, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SURPAD = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
