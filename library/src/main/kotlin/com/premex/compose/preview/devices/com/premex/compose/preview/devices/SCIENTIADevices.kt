package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SCIENTIA device specifications for Android Compose previews.
 *
 * This extension provides SCIENTIA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SCIENTIA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SCIENTIA: Any
  get() = object {
      /** DeviceSpec(manufacturer=SCIENTIA, code=BBT1019863, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SCIENTIA, code=BBT1019863,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val BBT1019863 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SCIENTIA, code=eWs10164T, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SCIENTIA, code=eWs10164T,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val EWS10164T = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
