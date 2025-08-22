package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PerseoTV device specifications for Android Compose previews.
 *
 * This extension provides PerseoTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PerseoTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PerseoTV: Any
  get() = object {
      /** DeviceSpec(manufacturer=PerseoTV, code=DV8219, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PerseoTV, code=DV8219, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8219 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
