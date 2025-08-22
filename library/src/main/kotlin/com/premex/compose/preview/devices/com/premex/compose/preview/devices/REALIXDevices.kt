package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * REALIX device specifications for Android Compose previews.
 *
 * This extension provides REALIX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.REALIX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.REALIX: Any
  get() = object {
      /** DeviceSpec(manufacturer=REALIX, code=RxIS202, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=REALIX, code=RxIS202, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val RXIS202 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
