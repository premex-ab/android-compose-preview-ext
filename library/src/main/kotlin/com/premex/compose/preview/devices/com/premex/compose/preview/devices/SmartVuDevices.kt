package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SmartVu device specifications for Android Compose previews.
 *
 * This extension provides SmartVu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SmartVu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SmartVu: Any
  get() = object {
      /** DeviceSpec(manufacturer=SmartVu, code=SEI730BSVU, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SmartVu, code=SEI730BSVU,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val SEI730BSVU = "spec:width=720,height=1280,unit=px,dpi=320"

  }
