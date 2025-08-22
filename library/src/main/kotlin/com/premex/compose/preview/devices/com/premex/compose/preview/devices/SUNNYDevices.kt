package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SUNNY device specifications for Android Compose previews.
 *
 * This extension provides SUNNY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SUNNY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SUNNY: Any
  get() = object {
      /** DeviceSpec(manufacturer=SUNNY, code=TABLET, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNNY, code=TABLET, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TABLET = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SUNNY, code=YQB, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNNY, code=YQB, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YQB = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
