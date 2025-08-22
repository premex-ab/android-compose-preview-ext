package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hicel device specifications for Android Compose previews.
 *
 * This extension provides Hicel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hicel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hicel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hicel, code=STAR_1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hicel, code=STAR_1, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val STAR_1 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
