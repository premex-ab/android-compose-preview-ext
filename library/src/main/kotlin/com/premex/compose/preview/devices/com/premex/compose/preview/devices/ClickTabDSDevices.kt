package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ClickTabDS device specifications for Android Compose previews.
 *
 * This extension provides ClickTabDS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ClickTabDS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ClickTabDS: Any
  get() = object {
      /** DeviceSpec(manufacturer=ClickTabDS, code=F19, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ClickTabDS, code=F19, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val F19 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
