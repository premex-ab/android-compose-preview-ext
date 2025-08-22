package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * METZ device specifications for Android Compose previews.
 *
 * This extension provides METZ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.METZ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.METZ: Any
  get() = object {
      /** DeviceSpec(manufacturer=METZ, code=86SG1, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=METZ, code=86SG1, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val _86SG1 = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
