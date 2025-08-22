package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * eNOVA device specifications for Android Compose previews.
 *
 * This extension provides eNOVA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ENOVA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ENOVA: Any
  get() = object {
      /** DeviceSpec(manufacturer=eNOVA, code=TAE08N10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eNOVA, code=TAE08N10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAE08N10 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
