package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ANAM device specifications for Android Compose previews.
 *
 * This extension provides ANAM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ANAM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ANAM: Any
  get() = object {
      /** DeviceSpec(manufacturer=ANAM, code=seocho, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ANAM, code=seocho, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEOCHO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
