package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AVITA device specifications for Android Compose previews.
 *
 * This extension provides AVITA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AVITA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AVITA: Any
  get() = object {
      /** DeviceSpec(manufacturer=AVITA, code=T101, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AVITA, code=T101, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val T101 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
