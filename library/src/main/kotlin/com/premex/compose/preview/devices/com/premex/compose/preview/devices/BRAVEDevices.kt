package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BRAVE device specifications for Android Compose previews.
 *
 * This extension provides BRAVE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BRAVE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BRAVE: Any
  get() = object {
      /** DeviceSpec(manufacturer=BRAVE, code=BT7X1, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BRAVE, code=BT7X1, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val BT7X1 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BRAVE, code=BT8X1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BRAVE, code=BT8X1, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val BT8X1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BRAVE, code=BTSL1, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BRAVE, code=BTSL1, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BTSL1 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BRAVE, code=BTXS1, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BRAVE, code=BTXS1, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val BTXS1 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BRAVE, code=EXCEED, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BRAVE, code=EXCEED, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val EXCEED = "spec:width=800,height=1280,unit=px,dpi=160"

  }
