package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FONOS_smart_electronics device specifications for Android Compose previews.
 *
 * This extension provides FONOS_smart_electronics device specifications that can be used with
 * @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FONOSsmartelectronics.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FONOSsmartelectronics: Any
  get() = object {
      /** DeviceSpec(manufacturer=FONOS_smart_electronics, code=Fonos-O1, width=1080, height=2160,
      dpi=480, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FONOS_smart_electronics,
      code=Fonos-O1, width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val FONOS_O1 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
