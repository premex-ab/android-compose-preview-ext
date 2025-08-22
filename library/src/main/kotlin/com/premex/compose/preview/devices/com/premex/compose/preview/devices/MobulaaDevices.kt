package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * mobulaa device specifications for Android Compose previews.
 *
 * This extension provides mobulaa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobulaa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobulaa: Any
  get() = object {
      /** DeviceSpec(manufacturer=mobulaa, code=K6, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobulaa, code=K6, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val K6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=mobulaa, code=NOTE1, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobulaa, code=NOTE1, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val NOTE1 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
