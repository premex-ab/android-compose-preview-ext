package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Listo device specifications for Android Compose previews.
 *
 * This extension provides Listo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Listo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Listo: Any
  get() = object {
      /** DeviceSpec(manufacturer=Listo, code=WebPad1004, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Listo, code=WebPad1004, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val WEBPAD1004 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
