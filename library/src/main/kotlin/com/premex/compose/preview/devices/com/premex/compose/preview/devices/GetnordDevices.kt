package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Getnord device specifications for Android Compose previews.
 *
 * This extension provides Getnord device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Getnord.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Getnord: Any
  get() = object {
      /** DeviceSpec(manufacturer=Getnord, code=LYNX, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Getnord, code=LYNX, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val LYNX = "spec:width=480,height=854,unit=px,dpi=240"

  }
