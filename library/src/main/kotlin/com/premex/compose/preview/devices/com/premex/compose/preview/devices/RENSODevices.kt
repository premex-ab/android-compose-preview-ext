package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RENSO device specifications for Android Compose previews.
 *
 * This extension provides RENSO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RENSO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RENSO: Any
  get() = object {
      /** DeviceSpec(manufacturer=RENSO, code=NEP_N1, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RENSO, code=NEP_N1, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val NEP_N1 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
