package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AXIOO device specifications for Android Compose previews.
 *
 * This extension provides AXIOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AXIOO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AXIOO: Any
  get() = object {
      /** DeviceSpec(manufacturer=AXIOO, code=PICOpad-7H, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AXIOO, code=PICOpad-7H, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val PICOPAD_7H = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=AXIOO, code=PICOpad_7H_JL, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AXIOO, code=PICOpad_7H_JL,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val PICOPAD_7H_JL = "spec:width=800,height=1280,unit=px,dpi=213"

  }
