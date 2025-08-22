package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Arris device specifications for Android Compose previews.
 *
 * This extension provides Arris device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Arris.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Arris: Any
  get() = object {
      /** DeviceSpec(manufacturer=Arris, code=SFO, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Arris, code=SFO, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SFO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
