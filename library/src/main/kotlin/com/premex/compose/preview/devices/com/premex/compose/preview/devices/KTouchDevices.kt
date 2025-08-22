package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * K-Touch device specifications for Android Compose previews.
 *
 * This extension provides K-Touch device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KTouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KTouch: Any
  get() = object {
      /** DeviceSpec(manufacturer=K-Touch, code=S5, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=K-Touch, code=S5, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S5 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
