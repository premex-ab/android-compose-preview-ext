package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * honor device specifications for Android Compose previews.
 *
 * This extension provides honor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Honor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Honor: Any
  get() = object {
      /** DeviceSpec(manufacturer=honor, code=HWFRD, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=honor, code=HWFRD, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val HWFRD = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
