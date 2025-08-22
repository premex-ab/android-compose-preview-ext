package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CHIEKO device specifications for Android Compose previews.
 *
 * This extension provides CHIEKO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CHIEKO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CHIEKO: Any
  get() = object {
      /** DeviceSpec(manufacturer=CHIEKO, code=lakeside, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHIEKO, code=lakeside, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAKESIDE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
