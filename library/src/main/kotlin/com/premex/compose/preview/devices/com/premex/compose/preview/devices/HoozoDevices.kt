package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hoozo device specifications for Android Compose previews.
 *
 * This extension provides Hoozo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hoozo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hoozo: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hoozo, code=MR768, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hoozo, code=MR768, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MR768 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hoozo, code=T10A, width=1200, height=2000, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hoozo, code=T10A, width=1200,
      height=2000, dpi=180, isGoogleDevice=false).code */
      val T10A = "spec:width=1200,height=2000,unit=px,dpi=180"

  }
