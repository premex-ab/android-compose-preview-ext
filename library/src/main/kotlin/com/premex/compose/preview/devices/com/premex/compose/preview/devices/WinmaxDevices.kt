package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Winmax device specifications for Android Compose previews.
 *
 * This extension provides Winmax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Winmax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Winmax: Any
  get() = object {
      /** DeviceSpec(manufacturer=Winmax, code=X50, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Winmax, code=X50, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val X50 = "spec:width=480,height=960,unit=px,dpi=240"

  }
