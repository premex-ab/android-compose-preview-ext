package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Zucchetti device specifications for Android Compose previews.
 *
 * This extension provides Zucchetti device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zucchetti.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zucchetti: Any
  get() = object {
      /** DeviceSpec(manufacturer=Zucchetti, code=Zpad_608, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zucchetti, code=Zpad_608,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val ZPAD_608 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
