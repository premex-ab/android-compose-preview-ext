package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ashima device specifications for Android Compose previews.
 *
 * This extension provides Ashima device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ashima.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ashima: Any
  get() = object {
      /** DeviceSpec(manufacturer=Ashima, code=songshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ashima, code=songshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
