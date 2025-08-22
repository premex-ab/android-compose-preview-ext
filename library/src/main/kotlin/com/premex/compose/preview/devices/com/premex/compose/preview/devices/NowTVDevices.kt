package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NowTV device specifications for Android Compose previews.
 *
 * This extension provides NowTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NowTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NowTV: Any
  get() = object {
      /** DeviceSpec(manufacturer=NowTV, code=3103, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NowTV, code=3103, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val _3103 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
