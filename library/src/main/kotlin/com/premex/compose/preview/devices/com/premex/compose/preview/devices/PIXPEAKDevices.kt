package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PIXPEAK device specifications for Android Compose previews.
 *
 * This extension provides PIXPEAK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PIXPEAK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PIXPEAK: Any
  get() = object {
      /** DeviceSpec(manufacturer=PIXPEAK, code=L60-EEA, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PIXPEAK, code=L60-EEA, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val L60_EEA = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=PIXPEAK, code=M258-EEA, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PIXPEAK, code=M258-EEA, width=1200,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val M258_EEA = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PIXPEAK, code=P107-EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PIXPEAK, code=P107-EEA, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val P107_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PIXPEAK, code=Tablet, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PIXPEAK, code=Tablet, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val TABLET = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PIXPEAK, code=U921, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PIXPEAK, code=U921, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val U921 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PIXPEAK, code=U921-EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PIXPEAK, code=U921-EEA, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val U921_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
