package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * G-Touch device specifications for Android Compose previews.
 *
 * This extension provides G-Touch device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GTouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GTouch: Any
  get() = object {
      /** DeviceSpec(manufacturer=G-Touch, code=SPEED_2021, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Touch, code=SPEED_2021,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SPEED_2021 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
