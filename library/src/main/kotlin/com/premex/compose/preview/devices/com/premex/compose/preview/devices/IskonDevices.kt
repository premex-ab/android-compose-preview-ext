package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Iskon device specifications for Android Compose previews.
 *
 * This extension provides Iskon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Iskon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Iskon: Any
  get() = object {
      /** DeviceSpec(manufacturer=Iskon, code=HY44G, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Iskon, code=HY44G, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HY44G = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Iskon, code=wh220_iskon, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Iskon, code=wh220_iskon,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val WH220_ISKON = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
