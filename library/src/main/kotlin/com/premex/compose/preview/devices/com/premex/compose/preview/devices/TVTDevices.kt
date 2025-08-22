package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TVT device specifications for Android Compose previews.
 *
 * This extension provides TVT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TVT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TVT: Any
  get() = object {
      /** DeviceSpec(manufacturer=TVT, code=TVT-T108, width=1200, height=1920, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TVT, code=TVT-T108, width=1200,
      height=1920, dpi=300, isGoogleDevice=false).code */
      val TVT_T108 = "spec:width=1200,height=1920,unit=px,dpi=300"

  }
