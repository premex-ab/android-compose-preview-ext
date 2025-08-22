package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Eaglesoar device specifications for Android Compose previews.
 *
 * This extension provides Eaglesoar device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Eaglesoar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Eaglesoar: Any
  get() = object {
      /** DeviceSpec(manufacturer=Eaglesoar, code=Z_766_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Eaglesoar, code=Z_766_EEA,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val Z_766_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
