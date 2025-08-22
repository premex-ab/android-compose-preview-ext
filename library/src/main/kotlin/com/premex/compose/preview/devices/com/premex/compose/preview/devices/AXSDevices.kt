package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AXS device specifications for Android Compose previews.
 *
 * This extension provides AXS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AXS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AXS: Any
  get() = object {
      /** DeviceSpec(manufacturer=AXS, code=B866V2FA_AXS, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AXS, code=B866V2FA_AXS, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val B866V2FA_AXS = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
