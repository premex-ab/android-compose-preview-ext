package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Octopus device specifications for Android Compose previews.
 *
 * This extension provides Octopus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Octopus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Octopus: Any
  get() = object {
      /** DeviceSpec(manufacturer=Octopus, code=Octopus_One, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Octopus, code=Octopus_One,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val OCTOPUS_ONE = "spec:width=800,height=1280,unit=px,dpi=213"

  }
