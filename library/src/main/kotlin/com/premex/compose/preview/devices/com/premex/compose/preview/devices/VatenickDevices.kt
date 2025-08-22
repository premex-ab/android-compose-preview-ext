package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * vatenick device specifications for Android Compose previews.
 *
 * This extension provides vatenick device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vatenick.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vatenick: Any
  get() = object {
      /** DeviceSpec(manufacturer=vatenick, code=v7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vatenick, code=v7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val V7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=vatenick, code=v7-EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vatenick, code=v7-EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val V7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
