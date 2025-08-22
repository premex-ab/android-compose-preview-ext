package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Arrow device specifications for Android Compose previews.
 *
 * This extension provides Arrow device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Arrow.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Arrow: Any
  get() = object {
      /** DeviceSpec(manufacturer=Arrow, code=M916H, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Arrow, code=M916H, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val M916H = "spec:width=720,height=1560,unit=px,dpi=320"

  }
