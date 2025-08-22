package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * maxtron device specifications for Android Compose previews.
 *
 * This extension provides maxtron device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Maxtron.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Maxtron: Any
  get() = object {
      /** DeviceSpec(manufacturer=maxtron, code=smart, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=maxtron, code=smart, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val SMART = "spec:width=600,height=1024,unit=px,dpi=213"

  }
