package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WINTEK device specifications for Android Compose previews.
 *
 * This extension provides WINTEK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WINTEK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WINTEK: Any
  get() = object {
      /** DeviceSpec(manufacturer=WINTEK, code=W405, width=480, height=800, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WINTEK, code=W405, width=480,
      height=800, dpi=213, isGoogleDevice=false).code */
      val W405 = "spec:width=480,height=800,unit=px,dpi=213"

  }
