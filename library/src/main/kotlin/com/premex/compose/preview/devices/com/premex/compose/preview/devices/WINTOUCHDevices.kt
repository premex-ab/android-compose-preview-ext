package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WINTOUCH device specifications for Android Compose previews.
 *
 * This extension provides WINTOUCH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WINTOUCH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WINTOUCH: Any
  get() = object {
      /** DeviceSpec(manufacturer=WINTOUCH, code=A20, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WINTOUCH, code=A20, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val A20 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=WINTOUCH, code=A50, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WINTOUCH, code=A50, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val A50 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=WINTOUCH, code=K19, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WINTOUCH, code=K19, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K19 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=WINTOUCH, code=Q705, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WINTOUCH, code=Q705, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Q705 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
