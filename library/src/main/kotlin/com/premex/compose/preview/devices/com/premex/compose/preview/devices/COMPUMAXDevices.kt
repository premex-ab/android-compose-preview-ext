package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * COMPUMAX device specifications for Android Compose previews.
 *
 * This extension provides COMPUMAX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.COMPUMAX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.COMPUMAX: Any
  get() = object {
      /** DeviceSpec(manufacturer=COMPUMAX, code=COMPUMAX, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COMPUMAX, code=COMPUMAX, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val COMPUMAX = "spec:width=800,height=1280,unit=px,dpi=160"

  }
