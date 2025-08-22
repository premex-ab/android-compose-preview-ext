package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IUSA device specifications for Android Compose previews.
 *
 * This extension provides IUSA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IUSA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IUSA: Any
  get() = object {
      /** DeviceSpec(manufacturer=IUSA, code=TR10CS1_8, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IUSA, code=TR10CS1_8, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TR10CS1_8 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
