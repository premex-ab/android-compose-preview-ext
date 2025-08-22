package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GTX device specifications for Android Compose previews.
 *
 * This extension provides GTX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GTX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GTX: Any
  get() = object {
      /** DeviceSpec(manufacturer=GTX, code=GTX_JACULUS, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GTX, code=GTX_JACULUS, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val GTX_JACULUS = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=GTX, code=GTX_JACULUS_01, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GTX, code=GTX_JACULUS_01,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val GTX_JACULUS_01 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GTX, code=Jaculus_V2, width=1200, height=1920, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GTX, code=Jaculus_V2, width=1200,
      height=1920, dpi=260, isGoogleDevice=false).code */
      val JACULUS_V2 = "spec:width=1200,height=1920,unit=px,dpi=260"

  }
