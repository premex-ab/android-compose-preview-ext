package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SAWINK device specifications for Android Compose previews.
 *
 * This extension provides SAWINK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SAWINK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SAWINK: Any
  get() = object {
      /** DeviceSpec(manufacturer=SAWINK, code=T10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SAWINK, code=T10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T10 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
