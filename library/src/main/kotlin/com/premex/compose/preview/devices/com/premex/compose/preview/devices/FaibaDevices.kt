package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Faiba device specifications for Android Compose previews.
 *
 * This extension provides Faiba device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Faiba.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Faiba: Any
  get() = object {
      /** DeviceSpec(manufacturer=Faiba, code=M1, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Faiba, code=M1, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val M1 = "spec:width=720,height=1600,unit=px,dpi=280"

  }
