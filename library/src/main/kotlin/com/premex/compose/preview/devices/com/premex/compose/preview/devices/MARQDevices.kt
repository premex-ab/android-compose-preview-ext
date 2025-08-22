package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MARQ device specifications for Android Compose previews.
 *
 * This extension provides MARQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MARQ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MARQ: Any
  get() = object {
      /** DeviceSpec(manufacturer=MARQ, code=DV6067H, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MARQ, code=DV6067H, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val DV6067H = "spec:width=720,height=1280,unit=px,dpi=213"

  }
