package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Kuori device specifications for Android Compose previews.
 *
 * This extension provides Kuori device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kuori.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kuori: Any
  get() = object {
      /** DeviceSpec(manufacturer=Kuori, code=Kivi, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kuori, code=Kivi, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val KIVI = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
