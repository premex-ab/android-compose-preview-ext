package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Tbltaca device specifications for Android Compose previews.
 *
 * This extension provides Tbltaca device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tbltaca.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tbltaca: Any
  get() = object {
      /** DeviceSpec(manufacturer=Tbltaca, code=Y108, width=1200, height=1920, dpi=248,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tbltaca, code=Y108, width=1200,
      height=1920, dpi=248, isGoogleDevice=false).code */
      val Y108 = "spec:width=1200,height=1920,unit=px,dpi=248"

  }
