package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MAXTRON device specifications for Android Compose previews.
 *
 * This extension provides MAXTRON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MAXTRON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MAXTRON: Any
  get() = object {
      /** DeviceSpec(manufacturer=MAXTRON, code=MAXTRON_Genio, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAXTRON, code=MAXTRON_Genio,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val MAXTRON_GENIO = "spec:width=800,height=1280,unit=px,dpi=213"

  }
