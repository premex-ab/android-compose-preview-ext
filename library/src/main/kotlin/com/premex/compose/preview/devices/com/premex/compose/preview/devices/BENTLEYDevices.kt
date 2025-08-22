package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BENTLEY device specifications for Android Compose previews.
 *
 * This extension provides BENTLEY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BENTLEY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BENTLEY: Any
  get() = object {
      /** DeviceSpec(manufacturer=BENTLEY, code=sdis1, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BENTLEY, code=sdis1, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SDIS1 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
