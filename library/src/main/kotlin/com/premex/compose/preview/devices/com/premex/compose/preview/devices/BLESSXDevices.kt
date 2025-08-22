package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BLESSX device specifications for Android Compose previews.
 *
 * This extension provides BLESSX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BLESSX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BLESSX: Any
  get() = object {
      /** DeviceSpec(manufacturer=BLESSX, code=T4SMODELX, width=442, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLESSX, code=T4SMODELX, width=442,
      height=960, dpi=200, isGoogleDevice=false).code */
      val T4SMODELX = "spec:width=442,height=960,unit=px,dpi=200"

  }
