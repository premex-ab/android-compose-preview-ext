package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Woxter device specifications for Android Compose previews.
 *
 * This extension provides Woxter device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Woxter.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Woxter: Any
  get() = object {
      /** DeviceSpec(manufacturer=Woxter, code=Woxter_N200, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Woxter, code=Woxter_N200,
      width=1200, height=1920, dpi=213, isGoogleDevice=false).code */
      val WOXTER_N200 = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Woxter, code=X100, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Woxter, code=X100, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val X100 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Woxter, code=X70, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Woxter, code=X70, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val X70 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
