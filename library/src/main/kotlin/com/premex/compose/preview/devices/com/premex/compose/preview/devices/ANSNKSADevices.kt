package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ANS_NKSA device specifications for Android Compose previews.
 *
 * This extension provides ANS_NKSA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ANSNKSA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ANSNKSA: Any
  get() = object {
      /** DeviceSpec(manufacturer=ANS_NKSA, code=NKSA_AQT82, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ANS_NKSA, code=NKSA_AQT82,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val NKSA_AQT82 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
