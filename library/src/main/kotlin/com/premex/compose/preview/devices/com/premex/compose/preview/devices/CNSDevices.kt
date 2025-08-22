package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CNS device specifications for Android Compose previews.
 *
 * This extension provides CNS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CNS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CNS: Any
  get() = object {
      /** DeviceSpec(manufacturer=CNS, code=BCM72604, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CNS, code=BCM72604, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BCM72604 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
