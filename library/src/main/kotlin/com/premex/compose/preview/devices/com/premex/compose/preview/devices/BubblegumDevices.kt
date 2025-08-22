package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Bubblegum device specifications for Android Compose previews.
 *
 * This extension provides Bubblegum device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bubblegum.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bubblegum: Any
  get() = object {
      /** DeviceSpec(manufacturer=Bubblegum, code=BUB6R-3T, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bubblegum, code=BUB6R-3T,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val BUB6R_3T = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Bubblegum, code=Junior_7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bubblegum, code=Junior_7,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val JUNIOR_7 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
