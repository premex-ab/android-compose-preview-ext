package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ELINK device specifications for Android Compose previews.
 *
 * This extension provides ELINK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ELINK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ELINK: Any
  get() = object {
      /** DeviceSpec(manufacturer=ELINK, code=T201, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ELINK, code=T201, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val T201 = "spec:width=1200,height=2000,unit=px,dpi=320"

  }
