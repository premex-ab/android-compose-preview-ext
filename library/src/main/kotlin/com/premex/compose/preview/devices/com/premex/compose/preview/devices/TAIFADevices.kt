package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TAIFA device specifications for Android Compose previews.
 *
 * This extension provides TAIFA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TAIFA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TAIFA: Any
  get() = object {
      /** DeviceSpec(manufacturer=TAIFA, code=TL1B_68, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TAIFA, code=TL1B_68, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val TL1B_68 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
