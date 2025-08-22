package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MI device specifications for Android Compose previews.
 *
 * This extension provides MI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MI: Any
  get() = object {
      /** DeviceSpec(manufacturer=MI, code=anglee, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MI, code=anglee, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ANGLEE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MI, code=eva, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MI, code=eva, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val EVA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
