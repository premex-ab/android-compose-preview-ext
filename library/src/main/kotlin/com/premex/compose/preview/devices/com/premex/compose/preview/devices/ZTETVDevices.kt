package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZTE_TV device specifications for Android Compose previews.
 *
 * This extension provides ZTE_TV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZTETV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZTETV: Any
  get() = object {
      /** DeviceSpec(manufacturer=ZTE_TV, code=B866_ZTE, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE_TV, code=B866_ZTE, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val B866_ZTE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
