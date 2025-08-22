package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TEENO device specifications for Android Compose previews.
 *
 * This extension provides TEENO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TEENO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TEENO: Any
  get() = object {
      /** DeviceSpec(manufacturer=TEENO, code=A1_EEA, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TEENO, code=A1_EEA, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val A1_EEA = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TEENO, code=TEENO_i12, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TEENO, code=TEENO_i12, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val TEENO_I12 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
