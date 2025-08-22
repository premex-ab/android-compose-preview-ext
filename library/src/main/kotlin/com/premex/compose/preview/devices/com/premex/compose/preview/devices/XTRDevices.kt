package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XTR device specifications for Android Compose previews.
 *
 * This extension provides XTR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XTR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XTR: Any
  get() = object {
      /** DeviceSpec(manufacturer=XTR, code=T4, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XTR, code=T4, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val T4 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=XTR, code=Z5, width=320, height=385, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XTR, code=Z5, width=320,
      height=385, dpi=160, isGoogleDevice=false).code */
      val Z5 = "spec:width=320,height=385,unit=px,dpi=160"

  }
