package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Grolier device specifications for Android Compose previews.
 *
 * This extension provides Grolier device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Grolier.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Grolier: Any
  get() = object {
      /** DeviceSpec(manufacturer=Grolier, code=GSR, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Grolier, code=GSR, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val GSR = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Grolier, code=GSR2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Grolier, code=GSR2, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val GSR2 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
