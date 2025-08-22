package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Brigmton device specifications for Android Compose previews.
 *
 * This extension provides Brigmton device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Brigmton.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Brigmton: Any
  get() = object {
      /** DeviceSpec(manufacturer=Brigmton, code=BTPC-1023OC4G, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Brigmton, code=BTPC-1023OC4G,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val BTPC_1023OC4G = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
