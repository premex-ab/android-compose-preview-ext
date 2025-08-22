package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * POZZI device specifications for Android Compose previews.
 *
 * This extension provides POZZI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.POZZI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.POZZI: Any
  get() = object {
      /** DeviceSpec(manufacturer=POZZI, code=Turbo, width=720, height=1600, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POZZI, code=Turbo, width=720,
      height=1600, dpi=220, isGoogleDevice=false).code */
      val TURBO = "spec:width=720,height=1600,unit=px,dpi=220"

  }
