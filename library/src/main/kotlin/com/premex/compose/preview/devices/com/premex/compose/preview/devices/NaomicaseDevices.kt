package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * naomicase device specifications for Android Compose previews.
 *
 * This extension provides naomicase device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Naomicase.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Naomicase: Any
  get() = object {
      /** DeviceSpec(manufacturer=naomicase, code=N4, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=naomicase, code=N4, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val N4 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=naomicase, code=N4MAX, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=naomicase, code=N4MAX, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val N4MAX = "spec:width=720,height=1600,unit=px,dpi=320"

  }
