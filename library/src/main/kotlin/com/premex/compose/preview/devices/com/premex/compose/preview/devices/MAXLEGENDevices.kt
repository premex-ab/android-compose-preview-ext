package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MAXLEGEN device specifications for Android Compose previews.
 *
 * This extension provides MAXLEGEN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MAXLEGEN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MAXLEGEN: Any
  get() = object {
      /** DeviceSpec(manufacturer=MAXLEGEN, code=M621, width=1400, height=2240, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAXLEGEN, code=M621, width=1400,
      height=2240, dpi=240, isGoogleDevice=false).code */
      val M621 = "spec:width=1400,height=2240,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MAXLEGEN, code=M621-EEA, width=1400, height=2240, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAXLEGEN, code=M621-EEA,
      width=1400, height=2240, dpi=240, isGoogleDevice=false).code */
      val M621_EEA = "spec:width=1400,height=2240,unit=px,dpi=240"

  }
