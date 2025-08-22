package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BQmobile device specifications for Android Compose previews.
 *
 * This extension provides BQmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BQmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BQmobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=BQmobile, code=BQ6761, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQmobile, code=BQ6761, width=720,
      height=1600, dpi=480, isGoogleDevice=false).code */
      val BQ6761 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BQmobile, code=BQ6861L, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQmobile, code=BQ6861L, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val BQ6861L = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
