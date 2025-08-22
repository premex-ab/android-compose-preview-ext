package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ATEAM device specifications for Android Compose previews.
 *
 * This extension provides ATEAM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ATEAM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ATEAM: Any
  get() = object {
      /** DeviceSpec(manufacturer=ATEAM, code=A1010, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATEAM, code=A1010, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val A1010 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ATEAM, code=A801, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATEAM, code=A801, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val A801 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
