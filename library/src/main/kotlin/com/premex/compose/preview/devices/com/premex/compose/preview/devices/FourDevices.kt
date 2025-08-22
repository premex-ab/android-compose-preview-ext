package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Four device specifications for Android Compose previews.
 *
 * This extension provides Four device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Four.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Four: Any
  get() = object {
      /** DeviceSpec(manufacturer=Four, code=S186_Sky_3, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Four, code=S186_Sky_3, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S186_SKY_3 = "spec:width=480,height=854,unit=px,dpi=240"

  }
