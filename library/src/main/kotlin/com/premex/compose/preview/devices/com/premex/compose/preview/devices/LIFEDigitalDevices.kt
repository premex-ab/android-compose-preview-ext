package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LIFE_Digital device specifications for Android Compose previews.
 *
 * This extension provides LIFE_Digital device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LIFEDigital.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LIFEDigital: Any
  get() = object {
      /** DeviceSpec(manufacturer=LIFE_Digital, code=K3102_4G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LIFE_Digital, code=K3102_4G,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val K3102_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=LIFE_Digital, code=K3102_W, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LIFE_Digital, code=K3102_W,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val K3102_W = "spec:width=800,height=1280,unit=px,dpi=160"

  }
