package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NewBrige device specifications for Android Compose previews.
 *
 * This extension provides NewBrige device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NewBrige.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NewBrige: Any
  get() = object {
      /** DeviceSpec(manufacturer=NewBrige, code=NBTB101b, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NewBrige, code=NBTB101b,
      width=1200, height=1920, dpi=213, isGoogleDevice=false).code */
      val NBTB101B = "spec:width=1200,height=1920,unit=px,dpi=213"

  }
