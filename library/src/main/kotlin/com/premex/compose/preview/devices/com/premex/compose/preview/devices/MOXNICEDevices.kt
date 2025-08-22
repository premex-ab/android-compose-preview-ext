package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MOXNICE device specifications for Android Compose previews.
 *
 * This extension provides MOXNICE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MOXNICE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MOXNICE: Any
  get() = object {
      /** DeviceSpec(manufacturer=MOXNICE, code=P50-EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MOXNICE, code=P50-EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P50_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MOXNICE, code=P50-ROW, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MOXNICE, code=P50-ROW, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P50_ROW = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MOXNICE, code=P63, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MOXNICE, code=P63, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val P63 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
