package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YINOCHE device specifications for Android Compose previews.
 *
 * This extension provides YINOCHE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YINOCHE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YINOCHE: Any
  get() = object {
      /** DeviceSpec(manufacturer=YINOCHE, code=R8, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YINOCHE, code=R8, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val R8 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=YINOCHE, code=Y8, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YINOCHE, code=Y8, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Y8 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
