package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Steren device specifications for Android Compose previews.
 *
 * This extension provides Steren device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Steren.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Steren: Any
  get() = object {
      /** DeviceSpec(manufacturer=Steren, code=INTV, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Steren, code=INTV, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val INTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Steren, code=INTV_1000, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Steren, code=INTV_1000, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val INTV_1000 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Steren, code=INTV_ASIST, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Steren, code=INTV_ASIST,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val INTV_ASIST = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
