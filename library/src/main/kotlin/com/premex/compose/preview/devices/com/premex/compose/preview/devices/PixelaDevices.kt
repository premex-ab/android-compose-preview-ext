package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Pixela device specifications for Android Compose previews.
 *
 * This extension provides Pixela device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pixela.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pixela: Any
  get() = object {
      /** DeviceSpec(manufacturer=Pixela, code=kyobashi, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pixela, code=kyobashi, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KYOBASHI = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Pixela, code=tennouji, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pixela, code=tennouji, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TENNOUJI = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
