package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BESTTAB device specifications for Android Compose previews.
 *
 * This extension provides BESTTAB device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BESTTAB.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BESTTAB: Any
  get() = object {
      /** DeviceSpec(manufacturer=BESTTAB, code=A10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BESTTAB, code=A10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val A10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BESTTAB, code=A20, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BESTTAB, code=A20, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val A20 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
