package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ORS device specifications for Android Compose previews.
 *
 * This extension provides ORS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ORS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ORS: Any
  get() = object {
      /** DeviceSpec(manufacturer=ORS, code=HY43X, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ORS, code=HY43X, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HY43X = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
