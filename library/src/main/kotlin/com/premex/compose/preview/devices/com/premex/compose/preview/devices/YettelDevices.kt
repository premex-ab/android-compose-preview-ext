package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Yettel device specifications for Android Compose previews.
 *
 * This extension provides Yettel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yettel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yettel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Yettel, code=STB_BG_B866V2H01, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Yettel, code=STB_BG_B866V2H01,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val STB_BG_B866V2H01 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
