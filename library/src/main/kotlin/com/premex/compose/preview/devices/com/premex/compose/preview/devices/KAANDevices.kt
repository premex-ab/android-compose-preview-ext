package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KAAN device specifications for Android Compose previews.
 *
 * This extension provides KAAN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KAAN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KAAN: Any
  get() = object {
      /** DeviceSpec(manufacturer=KAAN, code=KAAN_A1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KAAN, code=KAAN_A1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val KAAN_A1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KAAN, code=KAAN_N2, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KAAN, code=KAAN_N2, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val KAAN_N2 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
