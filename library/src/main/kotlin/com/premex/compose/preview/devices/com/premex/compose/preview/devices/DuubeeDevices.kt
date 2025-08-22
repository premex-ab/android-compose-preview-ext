package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * duubee device specifications for Android Compose previews.
 *
 * This extension provides duubee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Duubee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Duubee: Any
  get() = object {
      /** DeviceSpec(manufacturer=duubee, code=W1, width=240, height=296, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=duubee, code=W1, width=240,
      height=296, dpi=120, isGoogleDevice=false).code */
      val W1 = "spec:width=240,height=296,unit=px,dpi=120"

  }
