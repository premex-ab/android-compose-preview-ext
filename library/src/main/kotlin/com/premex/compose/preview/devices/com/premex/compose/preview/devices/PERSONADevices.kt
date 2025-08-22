package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PERSONA device specifications for Android Compose previews.
 *
 * This extension provides PERSONA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PERSONA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PERSONA: Any
  get() = object {
      /** DeviceSpec(manufacturer=PERSONA, code=MyTab_A8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PERSONA, code=MyTab_A8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MYTAB_A8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
