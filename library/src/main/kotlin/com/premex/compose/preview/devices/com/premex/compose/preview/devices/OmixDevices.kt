package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Omix device specifications for Android Compose previews.
 *
 * This extension provides Omix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Omix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Omix: Any
  get() = object {
      /** DeviceSpec(manufacturer=Omix, code=MixTab_Pro, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Omix, code=MixTab_Pro, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MIXTAB_PRO = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
