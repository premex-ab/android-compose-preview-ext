package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Togocel device specifications for Android Compose previews.
 *
 * This extension provides Togocel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Togocel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Togocel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Togocel, code=S63, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Togocel, code=S63, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S63 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Togocel, code=Togocel_F1_Max_4G, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Togocel, code=Togocel_F1_Max_4G,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val TOGOCEL_F1_MAX_4G = "spec:width=720,height=1440,unit=px,dpi=320"

  }
