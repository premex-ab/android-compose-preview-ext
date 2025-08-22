package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HYTERA device specifications for Android Compose previews.
 *
 * This extension provides HYTERA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HYTERA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HYTERA: Any
  get() = object {
      /** DeviceSpec(manufacturer=HYTERA, code=PDC550, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYTERA, code=PDC550, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PDC550 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
