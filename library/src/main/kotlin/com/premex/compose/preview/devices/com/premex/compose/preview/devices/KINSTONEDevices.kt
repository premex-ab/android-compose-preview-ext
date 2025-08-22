package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KINSTONE device specifications for Android Compose previews.
 *
 * This extension provides KINSTONE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KINSTONE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KINSTONE: Any
  get() = object {
      /** DeviceSpec(manufacturer=KINSTONE, code=KST102SF, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KINSTONE, code=KST102SF, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KST102SF = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KINSTONE, code=KST102SF_EA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KINSTONE, code=KST102SF_EA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val KST102SF_EA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KINSTONE, code=KST103SD_J, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KINSTONE, code=KST103SD_J,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val KST103SD_J = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KINSTONE, code=KST103SD-L, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KINSTONE, code=KST103SD-L,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val KST103SD_L = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
