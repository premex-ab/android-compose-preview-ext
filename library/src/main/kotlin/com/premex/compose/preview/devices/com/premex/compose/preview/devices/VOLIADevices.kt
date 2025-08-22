package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VOLIA device specifications for Android Compose previews.
 *
 * This extension provides VOLIA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VOLIA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VOLIA: Any
  get() = object {
      /** DeviceSpec(manufacturer=VOLIA, code=VOL001, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VOLIA, code=VOL001, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val VOL001 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
