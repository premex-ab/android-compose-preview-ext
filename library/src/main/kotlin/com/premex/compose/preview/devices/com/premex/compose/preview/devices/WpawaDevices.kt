package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Wpawa device specifications for Android Compose previews.
 *
 * This extension provides Wpawa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wpawa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wpawa: Any
  get() = object {
      /** DeviceSpec(manufacturer=Wpawa, code=HT10-A, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wpawa, code=HT10-A, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val HT10_A = "spec:width=800,height=1280,unit=px,dpi=160"

  }
