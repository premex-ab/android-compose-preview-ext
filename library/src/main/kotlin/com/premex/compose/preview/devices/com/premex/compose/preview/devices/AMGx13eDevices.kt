package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AMGx13e device specifications for Android Compose previews.
 *
 * This extension provides AMGx13e device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AMGx13e.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AMGx13e: Any
  get() = object {
      /** DeviceSpec(manufacturer=AMGx13e, code=ASPE2201, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AMGx13e, code=ASPE2201, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ASPE2201 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
