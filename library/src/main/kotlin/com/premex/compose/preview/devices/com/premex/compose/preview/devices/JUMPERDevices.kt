package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JUMPER device specifications for Android Compose previews.
 *
 * This extension provides JUMPER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JUMPER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JUMPER: Any
  get() = object {
      /** DeviceSpec(manufacturer=JUMPER, code=Z1, width=1664, height=2496, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JUMPER, code=Z1, width=1664,
      height=2496, dpi=213, isGoogleDevice=false).code */
      val Z1 = "spec:width=1664,height=2496,unit=px,dpi=213"

  }
