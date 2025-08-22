package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Junipers device specifications for Android Compose previews.
 *
 * This extension provides Junipers device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Junipers.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Junipers: Any
  get() = object {
      /** DeviceSpec(manufacturer=Junipers, code=CT8, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Junipers, code=CT8, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val CT8 = "spec:width=800,height=1280,unit=px,dpi=240"

  }
