package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * abxylute device specifications for Android Compose previews.
 *
 * This extension provides abxylute device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Abxylute.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Abxylute: Any
  get() = object {
      /** DeviceSpec(manufacturer=abxylute, code=abxylute_one, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=abxylute, code=abxylute_one,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val ABXYLUTE_ONE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
