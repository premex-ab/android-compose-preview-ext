package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * waiputv device specifications for Android Compose previews.
 *
 * This extension provides waiputv device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Waiputv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Waiputv: Any
  get() = object {
      /** DeviceSpec(manufacturer=waiputv, code=SEI700WP, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=waiputv, code=SEI700WP, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI700WP = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=waiputv, code=SEI730WP, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=waiputv, code=SEI730WP, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI730WP = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=waiputv, code=SEID00BWP, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=waiputv, code=SEID00BWP, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SEID00BWP = "spec:width=720,height=1280,unit=px,dpi=320"

  }
