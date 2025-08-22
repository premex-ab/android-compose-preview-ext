package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SAMTECH device specifications for Android Compose previews.
 *
 * This extension provides SAMTECH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SAMTECH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SAMTECH: Any
  get() = object {
      /** DeviceSpec(manufacturer=SAMTECH, code=TWIFI-06, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SAMTECH, code=TWIFI-06, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TWIFI_06 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
