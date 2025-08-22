package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BRIGMTON device specifications for Android Compose previews.
 *
 * This extension provides BRIGMTON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BRIGMTON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BRIGMTON: Any
  get() = object {
      /** DeviceSpec(manufacturer=BRIGMTON, code=BTPC-1025OC, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BRIGMTON, code=BTPC-1025OC,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val BTPC_1025OC = "spec:width=800,height=1280,unit=px,dpi=213"

  }
