package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ONDA_TLC device specifications for Android Compose previews.
 *
 * This extension provides ONDA_TLC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ONDATLC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ONDATLC: Any
  get() = object {
      /** DeviceSpec(manufacturer=ONDA_TLC, code=T7_PRO, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ONDA_TLC, code=T7_PRO, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val T7_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

  }
