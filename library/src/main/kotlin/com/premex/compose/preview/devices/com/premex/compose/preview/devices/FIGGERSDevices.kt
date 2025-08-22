package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FIGGERS device specifications for Android Compose previews.
 *
 * This extension provides FIGGERS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FIGGERS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FIGGERS: Any
  get() = object {
      /** DeviceSpec(manufacturer=FIGGERS, code=Figgers_F3, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FIGGERS, code=Figgers_F3,
      width=1080, height=2246, dpi=480, isGoogleDevice=false).code */
      val FIGGERS_F3 = "spec:width=1080,height=2246,unit=px,dpi=480"

  }
