package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JP device specifications for Android Compose previews.
 *
 * This extension provides JP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JP.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JP: Any
  get() = object {
      /** DeviceSpec(manufacturer=JP, code=TR10CS2_3, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JP, code=TR10CS2_3, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TR10CS2_3 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
