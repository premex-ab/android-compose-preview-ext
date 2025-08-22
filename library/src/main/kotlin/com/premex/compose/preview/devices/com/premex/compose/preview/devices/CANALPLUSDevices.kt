package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CANAL-PLUS device specifications for Android Compose previews.
 *
 * This extension provides CANAL-PLUS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CANALPLUS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CANALPLUS: Any
  get() = object {
      /** DeviceSpec(manufacturer=CANAL-PLUS, code=HY40A2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CANAL-PLUS, code=HY40A2,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val HY40A2 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
