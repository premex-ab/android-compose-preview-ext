package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DFN device specifications for Android Compose previews.
 *
 * This extension provides DFN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DFN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DFN: Any
  get() = object {
      /** DeviceSpec(manufacturer=DFN, code=Amigo7x3, width=480, height=720, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DFN, code=Amigo7x3, width=480,
      height=720, dpi=320, isGoogleDevice=false).code */
      val AMIGO7X3 = "spec:width=480,height=720,unit=px,dpi=320"

  }
