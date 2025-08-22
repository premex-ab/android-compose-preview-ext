package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PANORAMA device specifications for Android Compose previews.
 *
 * This extension provides PANORAMA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PANORAMA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PANORAMA: Any
  get() = object {
      /** DeviceSpec(manufacturer=PANORAMA, code=kualakai, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PANORAMA, code=kualakai,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val KUALAKAI = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
