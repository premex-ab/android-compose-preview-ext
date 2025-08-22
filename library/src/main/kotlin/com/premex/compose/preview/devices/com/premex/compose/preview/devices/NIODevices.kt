package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NIO device specifications for Android Compose previews.
 *
 * This extension provides NIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NIO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NIO: Any
  get() = object {
      /** DeviceSpec(manufacturer=NIO, code=davinci, width=1440, height=3200, dpi=600,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NIO, code=davinci, width=1440,
      height=3200, dpi=600, isGoogleDevice=false).code */
      val DAVINCI = "spec:width=1440,height=3200,unit=px,dpi=600"

      /** DeviceSpec(manufacturer=NIO, code=picasso, width=1440, height=3168, dpi=600,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NIO, code=picasso, width=1440,
      height=3168, dpi=600, isGoogleDevice=false).code */
      val PICASSO = "spec:width=1440,height=3168,unit=px,dpi=600"

  }
