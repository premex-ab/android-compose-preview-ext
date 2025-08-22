package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WINMAX device specifications for Android Compose previews.
 *
 * This extension provides WINMAX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WINMAX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WINMAX: Any
  get() = object {
      /** DeviceSpec(manufacturer=WINMAX, code=Tiger_X12, width=320, height=385, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WINMAX, code=Tiger_X12, width=320,
      height=385, dpi=160, isGoogleDevice=false).code */
      val TIGER_X12 = "spec:width=320,height=385,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=WINMAX, code=TIGER_X7, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WINMAX, code=TIGER_X7, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TIGER_X7 = "spec:width=480,height=854,unit=px,dpi=240"

  }
