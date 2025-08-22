package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Kinstone device specifications for Android Compose previews.
 *
 * This extension provides Kinstone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kinstone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kinstone: Any
  get() = object {
      /** DeviceSpec(manufacturer=Kinstone, code=CON_102, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kinstone, code=CON_102, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CON_102 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Kinstone, code=Kinstone_SA070, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kinstone, code=Kinstone_SA070,
      width=600, height=1024, dpi=213, isGoogleDevice=false).code */
      val KINSTONE_SA070 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Kinstone, code=KST102SA-EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kinstone, code=KST102SA-EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val KST102SA_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Kinstone, code=KST103RC, width=1200, height=1920, dpi=288,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kinstone, code=KST103RC,
      width=1200, height=1920, dpi=288, isGoogleDevice=false).code */
      val KST103RC = "spec:width=1200,height=1920,unit=px,dpi=288"

      /** DeviceSpec(manufacturer=Kinstone, code=KST103SD, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kinstone, code=KST103SD,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val KST103SD = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
