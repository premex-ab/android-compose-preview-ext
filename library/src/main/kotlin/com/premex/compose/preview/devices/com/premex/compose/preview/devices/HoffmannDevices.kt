package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hoffmann device specifications for Android Compose previews.
 *
 * This extension provides Hoffmann device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hoffmann.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hoffmann: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hoffmann, code=X-Max, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hoffmann, code=X-Max, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X_MAX = "spec:width=720,height=1280,unit=px,dpi=320"

  }
