package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Workmate device specifications for Android Compose previews.
 *
 * This extension provides Workmate device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Workmate.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Workmate: Any
  get() = object {
      /** DeviceSpec(manufacturer=Workmate, code=U13, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Workmate, code=U13, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val U13 = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
