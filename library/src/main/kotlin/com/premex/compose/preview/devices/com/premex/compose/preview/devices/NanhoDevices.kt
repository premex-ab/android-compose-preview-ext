package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Nanho device specifications for Android Compose previews.
 *
 * This extension provides Nanho device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nanho.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nanho: Any
  get() = object {
      /** DeviceSpec(manufacturer=Nanho, code=F101, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nanho, code=F101, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val F101 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
