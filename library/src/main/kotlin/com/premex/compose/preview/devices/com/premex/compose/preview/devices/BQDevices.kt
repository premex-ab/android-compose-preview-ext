package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BQ device specifications for Android Compose previews.
 *
 * This extension provides BQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BQ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BQ: Any
  get() = object {
      /** DeviceSpec(manufacturer=BQ, code=BQ-6051G, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQ, code=BQ-6051G, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val BQ_6051G = "spec:width=720,height=1560,unit=px,dpi=320"

  }
