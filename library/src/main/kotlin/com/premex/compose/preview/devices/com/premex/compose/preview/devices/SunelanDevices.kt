package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Sunelan device specifications for Android Compose previews.
 *
 * This extension provides Sunelan device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sunelan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sunelan: Any
  get() = object {
      /** DeviceSpec(manufacturer=Sunelan, code=Mountain_M8, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sunelan, code=Mountain_M8,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val MOUNTAIN_M8 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sunelan, code=River_X1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sunelan, code=River_X1, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val RIVER_X1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sunelan, code=River_X3, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sunelan, code=River_X3, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val RIVER_X3 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
