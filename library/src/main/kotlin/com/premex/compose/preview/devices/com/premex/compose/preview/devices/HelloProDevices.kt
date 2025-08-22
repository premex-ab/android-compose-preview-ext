package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HelloPro device specifications for Android Compose previews.
 *
 * This extension provides HelloPro device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HelloPro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HelloPro: Any
  get() = object {
      /** DeviceSpec(manufacturer=HelloPro, code=PK81R, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HelloPro, code=PK81R, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PK81R = "spec:width=800,height=1280,unit=px,dpi=213"

  }
