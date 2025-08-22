package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Odido device specifications for Android Compose previews.
 *
 * This extension provides Odido device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Odido.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Odido: Any
  get() = object {
      /** DeviceSpec(manufacturer=Odido, code=SEI800TFAS, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Odido, code=SEI800TFAS, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SEI800TFAS = "spec:width=720,height=1280,unit=px,dpi=320"

  }
