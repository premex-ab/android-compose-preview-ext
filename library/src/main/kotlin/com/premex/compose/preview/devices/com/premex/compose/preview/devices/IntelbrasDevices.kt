package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Intelbras device specifications for Android Compose previews.
 *
 * This extension provides Intelbras device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Intelbras.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Intelbras: Any
  get() = object {
      /** DeviceSpec(manufacturer=Intelbras, code=DV8038, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Intelbras, code=DV8038, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val DV8038 = "spec:width=720,height=1280,unit=px,dpi=213"

  }
