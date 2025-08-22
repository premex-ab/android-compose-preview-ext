package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * M-KOPA device specifications for Android Compose previews.
 *
 * This extension provides M-KOPA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MKOPA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MKOPA: Any
  get() = object {
      /** DeviceSpec(manufacturer=M-KOPA, code=S34, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=M-KOPA, code=S34, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val S34 = "spec:width=720,height=1612,unit=px,dpi=320"

  }
