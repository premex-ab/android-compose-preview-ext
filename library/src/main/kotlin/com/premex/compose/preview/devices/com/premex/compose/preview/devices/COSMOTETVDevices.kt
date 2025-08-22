package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * COSMOTE-TV device specifications for Android Compose previews.
 *
 * This extension provides COSMOTE-TV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.COSMOTETV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.COSMOTETV: Any
  get() = object {
      /** DeviceSpec(manufacturer=COSMOTE-TV, code=HY44G, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COSMOTE-TV, code=HY44G, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HY44G = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
