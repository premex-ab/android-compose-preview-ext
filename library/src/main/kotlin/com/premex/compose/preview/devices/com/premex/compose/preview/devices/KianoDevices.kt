package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Kiano device specifications for Android Compose previews.
 *
 * This extension provides Kiano device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kiano.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kiano: Any
  get() = object {
      /** DeviceSpec(manufacturer=Kiano, code=ELEGANCE_6, width=720, height=1512, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kiano, code=ELEGANCE_6, width=720,
      height=1512, dpi=320, isGoogleDevice=false).code */
      val ELEGANCE_6 = "spec:width=720,height=1512,unit=px,dpi=320"

  }
