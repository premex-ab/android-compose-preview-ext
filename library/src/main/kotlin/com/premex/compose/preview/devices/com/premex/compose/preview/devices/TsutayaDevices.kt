package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * tsutaya device specifications for Android Compose previews.
 *
 * This extension provides tsutaya device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tsutaya.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tsutaya: Any
  get() = object {
      /** DeviceSpec(manufacturer=tsutaya, code=ts201, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=tsutaya, code=ts201, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TS201 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
