package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Azom device specifications for Android Compose previews.
 *
 * This extension provides Azom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Azom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Azom: Any
  get() = object {
      /** DeviceSpec(manufacturer=Azom, code=Desert2, width=1080, height=2310, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Azom, code=Desert2, width=1080,
      height=2310, dpi=480, isGoogleDevice=false).code */
      val DESERT2 = "spec:width=1080,height=2310,unit=px,dpi=480"

  }
