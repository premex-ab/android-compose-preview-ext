package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Welio device specifications for Android Compose previews.
 *
 * This extension provides Welio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Welio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Welio: Any
  get() = object {
      /** DeviceSpec(manufacturer=Welio, code=wPad_Aura, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Welio, code=wPad_Aura, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val WPAD_AURA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
