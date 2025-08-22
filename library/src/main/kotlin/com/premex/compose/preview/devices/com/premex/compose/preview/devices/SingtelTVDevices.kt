package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Singtel_TV device specifications for Android Compose previews.
 *
 * This extension provides Singtel_TV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SingtelTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SingtelTV: Any
  get() = object {
      /** DeviceSpec(manufacturer=Singtel_TV, code=f561, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Singtel_TV, code=f561, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val F561 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
