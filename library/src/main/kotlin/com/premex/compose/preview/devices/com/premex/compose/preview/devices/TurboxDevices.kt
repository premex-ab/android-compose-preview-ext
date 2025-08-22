package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Turbox device specifications for Android Compose previews.
 *
 * This extension provides Turbox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Turbox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Turbox: Any
  get() = object {
      /** DeviceSpec(manufacturer=Turbox, code=Aqua_II, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Turbox, code=Aqua_II, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val AQUA_II = "spec:width=800,height=1280,unit=px,dpi=160"

  }
