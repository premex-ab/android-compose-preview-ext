package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ETOE device specifications for Android Compose previews.
 *
 * This extension provides ETOE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ETOE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ETOE: Any
  get() = object {
      /** DeviceSpec(manufacturer=ETOE, code=XNA, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ETOE, code=XNA, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val XNA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ETOE, code=YUL, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ETOE, code=YUL, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YUL = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
