package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * POS device specifications for Android Compose previews.
 *
 * This extension provides POS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.POS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.POS: Any
  get() = object {
      /** DeviceSpec(manufacturer=POS, code=POS, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POS, code=POS, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val POS = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
