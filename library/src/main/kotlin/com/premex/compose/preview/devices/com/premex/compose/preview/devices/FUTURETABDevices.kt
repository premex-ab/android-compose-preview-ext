package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FUTURETAB device specifications for Android Compose previews.
 *
 * This extension provides FUTURETAB device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FUTURETAB.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FUTURETAB: Any
  get() = object {
      /** DeviceSpec(manufacturer=FUTURETAB, code=CP80K, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FUTURETAB, code=CP80K, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CP80K = "spec:width=800,height=1280,unit=px,dpi=213"

  }
