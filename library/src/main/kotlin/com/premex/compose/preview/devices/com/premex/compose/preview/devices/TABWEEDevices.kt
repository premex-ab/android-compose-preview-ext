package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TABWEE device specifications for Android Compose previews.
 *
 * This extension provides TABWEE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TABWEE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TABWEE: Any
  get() = object {
      /** DeviceSpec(manufacturer=TABWEE, code=T20, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TABWEE, code=T20, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T20 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TABWEE, code=T90, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TABWEE, code=T90, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val T90 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=TABWEE, code=W90, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TABWEE, code=W90, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val W90 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
