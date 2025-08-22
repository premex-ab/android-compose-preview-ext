package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Prestige device specifications for Android Compose previews.
 *
 * This extension provides Prestige device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Prestige.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Prestige: Any
  get() = object {
      /** DeviceSpec(manufacturer=Prestige, code=Elite10QL, width=600, height=1024, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestige, code=Elite10QL,
      width=600, height=1024, dpi=120, isGoogleDevice=false).code */
      val ELITE10QL = "spec:width=600,height=1024,unit=px,dpi=120"

  }
