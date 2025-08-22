package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TeclastKorea device specifications for Android Compose previews.
 *
 * This extension provides TeclastKorea device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TeclastKorea.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TeclastKorea: Any
  get() = object {
      /** DeviceSpec(manufacturer=TeclastKorea, code=tPad8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TeclastKorea, code=tPad8,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TPAD8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
