package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Daewoo device specifications for Android Compose previews.
 *
 * This extension provides Daewoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Daewoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Daewoo: Any
  get() = object {
      /** DeviceSpec(manufacturer=Daewoo, code=DW-TN7RK16, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Daewoo, code=DW-TN7RK16, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val DW_TN7RK16 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Daewoo, code=Neon, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Daewoo, code=Neon, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val NEON = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Daewoo, code=sunnyvale, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Daewoo, code=sunnyvale, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SUNNYVALE = "spec:width=720,height=1280,unit=px,dpi=213"

  }
