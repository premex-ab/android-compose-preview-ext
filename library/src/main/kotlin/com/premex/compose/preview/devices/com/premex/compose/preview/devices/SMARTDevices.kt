package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SMART device specifications for Android Compose previews.
 *
 * This extension provides SMART device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SMART.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SMART: Any
  get() = object {
      /** DeviceSpec(manufacturer=SMART, code=Advance_Pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMART, code=Advance_Pro, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ADVANCE_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SMART, code=Coral_4, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMART, code=Coral_4, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val CORAL_4 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SMART, code=e-PAD, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMART, code=e-PAD, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val E_PAD = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SMART, code=groundhog, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMART, code=groundhog, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val GROUNDHOG = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SMART, code=komodo, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMART, code=komodo, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val KOMODO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SMART, code=M20, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMART, code=M20, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val M20 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SMART, code=M30, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMART, code=M30, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val M30 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SMART, code=M50, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMART, code=M50, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val M50 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SMART, code=Slide_Lite, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMART, code=Slide_Lite, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SLIDE_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

  }
