package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Sunbrite device specifications for Android Compose previews.
 *
 * This extension provides Sunbrite device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sunbrite.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sunbrite: Any
  get() = object {
      /** DeviceSpec(manufacturer=Sunbrite, code=huangshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sunbrite, code=huangshan,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val HUANGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
