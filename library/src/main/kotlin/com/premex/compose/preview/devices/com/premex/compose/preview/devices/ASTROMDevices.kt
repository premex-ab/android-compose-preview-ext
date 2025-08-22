package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ASTROM device specifications for Android Compose previews.
 *
 * This extension provides ASTROM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ASTROM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ASTROM: Any
  get() = object {
      /** DeviceSpec(manufacturer=ASTROM, code=AST707G, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ASTROM, code=AST707G, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val AST707G = "spec:width=600,height=1024,unit=px,dpi=213"

  }
