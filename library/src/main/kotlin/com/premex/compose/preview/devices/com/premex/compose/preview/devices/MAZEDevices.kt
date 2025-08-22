package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MAZE device specifications for Android Compose previews.
 *
 * This extension provides MAZE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MAZE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MAZE: Any
  get() = object {
      /** DeviceSpec(manufacturer=MAZE, code=Alpha, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAZE, code=Alpha, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ALPHA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=MAZE, code=Alpha_X, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAZE, code=Alpha_X, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val ALPHA_X = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
