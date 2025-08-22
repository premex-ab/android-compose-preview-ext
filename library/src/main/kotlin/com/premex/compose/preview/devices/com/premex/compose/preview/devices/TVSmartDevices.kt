package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TVSmart device specifications for Android Compose previews.
 *
 * This extension provides TVSmart device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TVSmart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TVSmart: Any
  get() = object {
      /** DeviceSpec(manufacturer=TVSmart, code=DV8981-KPV, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TVSmart, code=DV8981-KPV,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8981_KPV = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
