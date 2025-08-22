package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mlink device specifications for Android Compose previews.
 *
 * This extension provides Mlink device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mlink.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mlink: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mlink, code=M6501B, width=540, height=1200, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mlink, code=M6501B, width=540,
      height=1200, dpi=240, isGoogleDevice=false).code */
      val M6501B = "spec:width=540,height=1200,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mlink, code=M761, width=720, height=1520, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mlink, code=M761, width=720,
      height=1520, dpi=260, isGoogleDevice=false).code */
      val M761 = "spec:width=720,height=1520,unit=px,dpi=260"

  }
