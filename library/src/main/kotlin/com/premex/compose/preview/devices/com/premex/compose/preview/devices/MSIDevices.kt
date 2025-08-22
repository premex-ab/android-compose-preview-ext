package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MSI device specifications for Android Compose previews.
 *
 * This extension provides MSI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MSI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MSI: Any
  get() = object {
      /** DeviceSpec(manufacturer=MSI, code=caoya, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MSI, code=caoya, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val CAOYA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MSI, code=ND52-Gen2, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MSI, code=ND52-Gen2, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val ND52_GEN2 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
