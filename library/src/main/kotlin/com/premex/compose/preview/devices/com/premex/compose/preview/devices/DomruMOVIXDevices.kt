package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dom-ru_MOVIX device specifications for Android Compose previews.
 *
 * This extension provides Dom-ru_MOVIX device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DomruMOVIX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DomruMOVIX: Any
  get() = object {
      /** DeviceSpec(manufacturer=Dom-ru_MOVIX, code=SEI200, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dom-ru_MOVIX, code=SEI200,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI200 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
