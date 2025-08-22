package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CHCNAV device specifications for Android Compose previews.
 *
 * This extension provides CHCNAV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CHCNAV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CHCNAV: Any
  get() = object {
      /** DeviceSpec(manufacturer=CHCNAV, code=HCE600, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHCNAV, code=HCE600, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val HCE600 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CHCNAV, code=LT60, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHCNAV, code=LT60, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val LT60 = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=CHCNAV, code=LT700, width=1200, height=1920, dpi=306,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHCNAV, code=LT700, width=1200,
      height=1920, dpi=306, isGoogleDevice=false).code */
      val LT700 = "spec:width=1200,height=1920,unit=px,dpi=306"

      /** DeviceSpec(manufacturer=CHCNAV, code=LT800, width=1200, height=1920, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHCNAV, code=LT800, width=1200,
      height=1920, dpi=360, isGoogleDevice=false).code */
      val LT800 = "spec:width=1200,height=1920,unit=px,dpi=360"

  }
