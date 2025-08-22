package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Figgers device specifications for Android Compose previews.
 *
 * This extension provides Figgers device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Figgers.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Figgers: Any
  get() = object {
      /** DeviceSpec(manufacturer=Figgers, code=Figgers_DragonX, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Figgers, code=Figgers_DragonX,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val FIGGERS_DRAGONX = "spec:width=720,height=1600,unit=px,dpi=320"

  }
