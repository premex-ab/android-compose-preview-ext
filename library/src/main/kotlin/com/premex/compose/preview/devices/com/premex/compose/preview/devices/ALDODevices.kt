package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ALDO device specifications for Android Compose previews.
 *
 * This extension provides ALDO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ALDO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ALDO: Any
  get() = object {
      /** DeviceSpec(manufacturer=ALDO, code=T10S, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALDO, code=T10S, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T10S = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ALDO, code=T7Q-4G, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALDO, code=T7Q-4G, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val T7Q_4G = "spec:width=600,height=1024,unit=px,dpi=213"

  }
