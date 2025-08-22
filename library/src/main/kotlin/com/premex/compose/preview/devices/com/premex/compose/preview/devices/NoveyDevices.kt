package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * novey device specifications for Android Compose previews.
 *
 * This extension provides novey device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Novey.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Novey: Any
  get() = object {
      /** DeviceSpec(manufacturer=novey, code=Alpha_A16, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=novey, code=Alpha_A16, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val ALPHA_A16 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=novey, code=Start_S, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=novey, code=Start_S, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val START_S = "spec:width=720,height=1600,unit=px,dpi=320"

  }
