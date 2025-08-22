package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ViMa-Tek device specifications for Android Compose previews.
 *
 * This extension provides ViMa-Tek device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ViMaTek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ViMaTek: Any
  get() = object {
      /** DeviceSpec(manufacturer=ViMa-Tek, code=VM20, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ViMa-Tek, code=VM20, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val VM20 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
