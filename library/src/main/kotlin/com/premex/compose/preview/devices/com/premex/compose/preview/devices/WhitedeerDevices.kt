package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Whitedeer device specifications for Android Compose previews.
 *
 * This extension provides Whitedeer device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Whitedeer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Whitedeer: Any
  get() = object {
      /** DeviceSpec(manufacturer=Whitedeer, code=G13, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Whitedeer, code=G13, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val G13 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
