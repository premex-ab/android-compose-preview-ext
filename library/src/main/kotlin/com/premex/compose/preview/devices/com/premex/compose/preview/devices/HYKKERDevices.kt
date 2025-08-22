package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HYKKER device specifications for Android Compose previews.
 *
 * This extension provides HYKKER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HYKKER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HYKKER: Any
  get() = object {
      /** DeviceSpec(manufacturer=HYKKER, code=DV8038, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYKKER, code=DV8038, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val DV8038 = "spec:width=720,height=1280,unit=px,dpi=213"

  }
