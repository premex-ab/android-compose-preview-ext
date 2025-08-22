package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OXYGEN-id device specifications for Android Compose previews.
 *
 * This extension provides OXYGEN-id device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OXYGENid.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OXYGENid: Any
  get() = object {
      /** DeviceSpec(manufacturer=OXYGEN-id, code=SEI700MRT, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OXYGEN-id, code=SEI700MRT,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI700MRT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
