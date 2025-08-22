package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Zitab device specifications for Android Compose previews.
 *
 * This extension provides Zitab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zitab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zitab: Any
  get() = object {
      /** DeviceSpec(manufacturer=Zitab, code=Zitab01, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zitab, code=Zitab01, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val ZITAB01 = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
