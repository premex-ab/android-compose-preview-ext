package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mira device specifications for Android Compose previews.
 *
 * This extension provides Mira device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mira.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mira: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mira, code=X2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mira, code=X2, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val X2 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
