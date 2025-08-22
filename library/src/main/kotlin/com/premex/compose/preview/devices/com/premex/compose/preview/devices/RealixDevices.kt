package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Realix device specifications for Android Compose previews.
 *
 * This extension provides Realix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Realix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Realix: Any
  get() = object {
      /** DeviceSpec(manufacturer=Realix, code=RxIS201, width=720, height=1480, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Realix, code=RxIS201, width=720,
      height=1480, dpi=320, isGoogleDevice=false).code */
      val RXIS201 = "spec:width=720,height=1480,unit=px,dpi=320"

  }
