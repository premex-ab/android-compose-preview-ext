package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ONYX device specifications for Android Compose previews.
 *
 * This extension provides ONYX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ONYX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ONYX: Any
  get() = object {
      /** DeviceSpec(manufacturer=ONYX, code=BOOX, width=1404, height=1872, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ONYX, code=BOOX, width=1404,
      height=1872, dpi=240, isGoogleDevice=false).code */
      val BOOX = "spec:width=1404,height=1872,unit=px,dpi=240"

  }
