package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DTAB device specifications for Android Compose previews.
 *
 * This extension provides DTAB device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DTAB.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DTAB: Any
  get() = object {
      /** DeviceSpec(manufacturer=DTAB, code=TK_P617_3_3Ghz, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DTAB, code=TK_P617_3_3Ghz,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val TK_P617_3_3GHZ = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
