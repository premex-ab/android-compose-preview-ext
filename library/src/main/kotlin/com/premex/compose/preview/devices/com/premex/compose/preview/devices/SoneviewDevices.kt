package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Soneview device specifications for Android Compose previews.
 *
 * This extension provides Soneview device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Soneview.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Soneview: Any
  get() = object {
      /** DeviceSpec(manufacturer=Soneview, code=SV_TAB10, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Soneview, code=SV_TAB10, width=800,
      height=1280, dpi=220, isGoogleDevice=false).code */
      val SV_TAB10 = "spec:width=800,height=1280,unit=px,dpi=220"

  }
