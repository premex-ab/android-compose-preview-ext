package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * shoudum device specifications for Android Compose previews.
 *
 * This extension provides shoudum device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Shoudum.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Shoudum: Any
  get() = object {
      /** DeviceSpec(manufacturer=shoudum, code=X50, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=shoudum, code=X50, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val X50 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=shoudum, code=X50US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=shoudum, code=X50US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val X50US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=shoudum, code=X_50, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=shoudum, code=X_50, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val X_50 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=shoudum, code=X_50_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=shoudum, code=X_50_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val X_50_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
