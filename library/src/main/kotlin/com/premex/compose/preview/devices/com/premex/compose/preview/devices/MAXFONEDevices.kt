package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MAXFONE device specifications for Android Compose previews.
 *
 * This extension provides MAXFONE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MAXFONE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MAXFONE: Any
  get() = object {
      /** DeviceSpec(manufacturer=MAXFONE, code=MAX_1X, width=480, height=1014, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAXFONE, code=MAX_1X, width=480,
      height=1014, dpi=240, isGoogleDevice=false).code */
      val MAX_1X = "spec:width=480,height=1014,unit=px,dpi=240"

  }
