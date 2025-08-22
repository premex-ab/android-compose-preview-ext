package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ANS_NKS device specifications for Android Compose previews.
 *
 * This extension provides ANS_NKS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ANSNKS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ANSNKS: Any
  get() = object {
      /** DeviceSpec(manufacturer=ANS_NKS, code=NKS_AQT80, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ANS_NKS, code=NKS_AQT80, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NKS_AQT80 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
