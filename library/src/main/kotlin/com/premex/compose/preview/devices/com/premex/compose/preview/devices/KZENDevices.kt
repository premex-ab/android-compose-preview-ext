package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KZEN device specifications for Android Compose previews.
 *
 * This extension provides KZEN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KZEN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KZEN: Any
  get() = object {
      /** DeviceSpec(manufacturer=KZEN, code=Lamia_L01, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KZEN, code=Lamia_L01, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val LAMIA_L01 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
