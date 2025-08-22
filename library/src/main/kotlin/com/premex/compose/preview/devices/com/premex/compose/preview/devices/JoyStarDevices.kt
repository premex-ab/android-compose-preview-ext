package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JoyStar device specifications for Android Compose previews.
 *
 * This extension provides JoyStar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JoyStar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JoyStar: Any
  get() = object {
      /** DeviceSpec(manufacturer=JoyStar, code=JoyStar_J10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JoyStar, code=JoyStar_J10,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val JOYSTAR_J10 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
