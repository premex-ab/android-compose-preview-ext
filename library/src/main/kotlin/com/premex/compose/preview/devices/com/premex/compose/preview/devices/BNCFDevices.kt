package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BNCF device specifications for Android Compose previews.
 *
 * This extension provides BNCF device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BNCF.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BNCF: Any
  get() = object {
      /** DeviceSpec(manufacturer=BNCF, code=BPad, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BNCF, code=BPad, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val BPAD = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=BNCF, code=BPad_10_4G, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BNCF, code=BPad_10_4G, width=1200,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val BPAD_10_4G = "spec:width=1200,height=1920,unit=px,dpi=213"

  }
