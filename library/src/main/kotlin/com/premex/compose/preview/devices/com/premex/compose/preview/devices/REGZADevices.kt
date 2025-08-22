package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * REGZA device specifications for Android Compose previews.
 *
 * This extension provides REGZA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.REGZA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.REGZA: Any
  get() = object {
      /** DeviceSpec(manufacturer=REGZA, code=hengshan, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=REGZA, code=hengshan, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val HENGSHAN = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=REGZA, code=YYT, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=REGZA, code=YYT, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YYT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
