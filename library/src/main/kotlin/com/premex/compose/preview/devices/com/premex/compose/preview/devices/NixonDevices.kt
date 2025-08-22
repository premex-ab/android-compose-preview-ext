package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Nixon device specifications for Android Compose previews.
 *
 * This extension provides Nixon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nixon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nixon: Any
  get() = object {
      /** DeviceSpec(manufacturer=Nixon, code=sculpin, width=400, height=400, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nixon, code=sculpin, width=400,
      height=400, dpi=280, isGoogleDevice=false).code */
      val SCULPIN = "spec:width=400,height=400,unit=px,dpi=280"

  }
