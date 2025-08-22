package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SQ device specifications for Android Compose previews.
 *
 * This extension provides SQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SQ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SQ: Any
  get() = object {
      /** DeviceSpec(manufacturer=SQ, code=Hope10_Max, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SQ, code=Hope10_Max, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HOPE10_MAX = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SQ, code=Hope8_Max, width=800, height=1280, dpi=204,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SQ, code=Hope8_Max, width=800,
      height=1280, dpi=204, isGoogleDevice=false).code */
      val HOPE8_MAX = "spec:width=800,height=1280,unit=px,dpi=204"

  }
