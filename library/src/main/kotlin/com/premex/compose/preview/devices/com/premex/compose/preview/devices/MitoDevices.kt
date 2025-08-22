package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mito device specifications for Android Compose previews.
 *
 * This extension provides Mito device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mito.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mito: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mito, code=A67, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mito, code=A67, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val A67 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
