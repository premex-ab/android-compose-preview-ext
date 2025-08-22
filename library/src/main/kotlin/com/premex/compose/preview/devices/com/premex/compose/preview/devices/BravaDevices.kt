package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Brava device specifications for Android Compose previews.
 *
 * This extension provides Brava device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Brava.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Brava: Any
  get() = object {
      /** DeviceSpec(manufacturer=Brava, code=DU_600, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Brava, code=DU_600, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val DU_600 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
