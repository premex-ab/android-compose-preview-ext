package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HAEHNE device specifications for Android Compose previews.
 *
 * This extension provides HAEHNE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HAEHNE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HAEHNE: Any
  get() = object {
      /** DeviceSpec(manufacturer=HAEHNE, code=A863K_EEA, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAEHNE, code=A863K_EEA, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val A863K_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

  }
