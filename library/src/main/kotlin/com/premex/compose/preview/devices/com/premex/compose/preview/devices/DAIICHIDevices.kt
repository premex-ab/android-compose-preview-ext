package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DAIICHI device specifications for Android Compose previews.
 *
 * This extension provides DAIICHI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DAIICHI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DAIICHI: Any
  get() = object {
      /** DeviceSpec(manufacturer=DAIICHI, code=martin, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DAIICHI, code=martin, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

  }
