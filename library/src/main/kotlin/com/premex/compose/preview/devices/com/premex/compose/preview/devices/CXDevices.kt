package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CX device specifications for Android Compose previews.
 *
 * This extension provides CX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CX: Any
  get() = object {
      /** DeviceSpec(manufacturer=CX, code=CX9011, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CX, code=CX9011, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val CX9011 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
