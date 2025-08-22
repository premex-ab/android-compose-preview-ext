package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DICLE device specifications for Android Compose previews.
 *
 * This extension provides DICLE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DICLE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DICLE: Any
  get() = object {
      /** DeviceSpec(manufacturer=DICLE, code=DICLE_IPLAY40_PRO, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DICLE, code=DICLE_IPLAY40_PRO,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val DICLE_IPLAY40_PRO = "spec:width=1200,height=2000,unit=px,dpi=320"

  }
