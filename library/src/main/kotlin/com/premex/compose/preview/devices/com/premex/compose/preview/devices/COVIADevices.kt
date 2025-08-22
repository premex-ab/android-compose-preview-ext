package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * COVIA device specifications for Android Compose previews.
 *
 * This extension provides COVIA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.COVIA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.COVIA: Any
  get() = object {
      /** DeviceSpec(manufacturer=COVIA, code=CP-L45s, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COVIA, code=CP-L45s, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val CP_L45S = "spec:width=480,height=854,unit=px,dpi=240"

  }
