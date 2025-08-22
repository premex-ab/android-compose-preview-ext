package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TOYA device specifications for Android Compose previews.
 *
 * This extension provides TOYA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TOYA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TOYA: Any
  get() = object {
      /** DeviceSpec(manufacturer=TOYA, code=DTC974x, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOYA, code=DTC974x, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DTC974X = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TOYA, code=DTC974y, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOYA, code=DTC974y, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DTC974Y = "spec:width=720,height=1280,unit=px,dpi=320"

  }
