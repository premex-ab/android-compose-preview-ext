package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Suunto device specifications for Android Compose previews.
 *
 * This extension provides Suunto device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Suunto.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Suunto: Any
  get() = object {
      /** DeviceSpec(manufacturer=Suunto, code=salmon, width=454, height=454, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Suunto, code=salmon, width=454,
      height=454, dpi=320, isGoogleDevice=false).code */
      val SALMON = "spec:width=454,height=454,unit=px,dpi=320"

  }
