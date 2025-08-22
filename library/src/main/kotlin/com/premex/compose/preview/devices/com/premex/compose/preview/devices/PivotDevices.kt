package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Pivot device specifications for Android Compose previews.
 *
 * This extension provides Pivot device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pivot.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pivot: Any
  get() = object {
      /** DeviceSpec(manufacturer=Pivot, code=PVT-8-A50-R1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pivot, code=PVT-8-A50-R1,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val PVT_8_A50_R1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Pivot, code=PVT-R78-3288, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pivot, code=PVT-R78-3288,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val PVT_R78_3288 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
