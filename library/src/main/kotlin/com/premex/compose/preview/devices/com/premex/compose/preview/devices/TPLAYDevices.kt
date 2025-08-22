package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TPLAY device specifications for Android Compose previews.
 *
 * This extension provides TPLAY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TPLAY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TPLAY: Any
  get() = object {
      /** DeviceSpec(manufacturer=TPLAY, code=SEI800TCT, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TPLAY, code=SEI800TCT, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SEI800TCT = "spec:width=720,height=1280,unit=px,dpi=320"

  }
