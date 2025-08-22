package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IKALL device specifications for Android Compose previews.
 *
 * This extension provides IKALL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IKALL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IKALL: Any
  get() = object {
      /** DeviceSpec(manufacturer=IKALL, code=IKALL, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IKALL, code=IKALL, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val IKALL = "spec:width=600,height=1024,unit=px,dpi=160"

  }
