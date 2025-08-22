package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Trevi device specifications for Android Compose previews.
 *
 * This extension provides Trevi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Trevi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Trevi: Any
  get() = object {
      /** DeviceSpec(manufacturer=Trevi, code=Tab104GS2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trevi, code=Tab104GS2, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB104GS2 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
