package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FORMULER device specifications for Android Compose previews.
 *
 * This extension provides FORMULER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FORMULER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FORMULER: Any
  get() = object {
      /** DeviceSpec(manufacturer=FORMULER, code=GTV, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FORMULER, code=GTV, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
