package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AYYA device specifications for Android Compose previews.
 *
 * This extension provides AYYA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AYYA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AYYA: Any
  get() = object {
      /** DeviceSpec(manufacturer=AYYA, code=T1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AYYA, code=T1, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val T1 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
