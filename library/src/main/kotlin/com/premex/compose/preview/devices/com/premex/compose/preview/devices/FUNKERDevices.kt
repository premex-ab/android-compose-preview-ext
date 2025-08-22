package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FUNKER device specifications for Android Compose previews.
 *
 * This extension provides FUNKER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FUNKER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FUNKER: Any
  get() = object {
      /** DeviceSpec(manufacturer=FUNKER, code=E500i, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FUNKER, code=E500i, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val E500I = "spec:width=480,height=960,unit=px,dpi=240"

  }
