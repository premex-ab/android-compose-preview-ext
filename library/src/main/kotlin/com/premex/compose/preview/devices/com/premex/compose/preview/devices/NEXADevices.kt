package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NEXA device specifications for Android Compose previews.
 *
 * This extension provides NEXA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NEXA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NEXA: Any
  get() = object {
      /** DeviceSpec(manufacturer=NEXA, code=NexaN5a, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEXA, code=NexaN5a, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val NEXAN5A = "spec:width=480,height=854,unit=px,dpi=240"

  }
