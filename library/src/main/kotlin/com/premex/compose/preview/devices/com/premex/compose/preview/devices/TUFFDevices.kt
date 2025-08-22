package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TUFF device specifications for Android Compose previews.
 *
 * This extension provides TUFF device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TUFF.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TUFF: Any
  get() = object {
      /** DeviceSpec(manufacturer=TUFF, code=T500, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TUFF, code=T500, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val T500 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
