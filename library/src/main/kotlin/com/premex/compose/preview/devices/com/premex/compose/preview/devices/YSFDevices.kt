package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YSF device specifications for Android Compose previews.
 *
 * This extension provides YSF device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YSF.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YSF: Any
  get() = object {
      /** DeviceSpec(manufacturer=YSF, code=Rugged_tablet, width=1200, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YSF, code=Rugged_tablet,
      width=1200, height=1920, dpi=480, isGoogleDevice=false).code */
      val RUGGED_TABLET = "spec:width=1200,height=1920,unit=px,dpi=480"

  }
