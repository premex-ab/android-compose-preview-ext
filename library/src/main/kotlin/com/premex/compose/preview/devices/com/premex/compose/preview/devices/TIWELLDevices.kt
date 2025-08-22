package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TIWELL device specifications for Android Compose previews.
 *
 * This extension provides TIWELL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TIWELL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TIWELL: Any
  get() = object {
      /** DeviceSpec(manufacturer=TIWELL, code=AP-115G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TIWELL, code=AP-115G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val AP_115G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TIWELL, code=AS_601L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TIWELL, code=AS_601L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val AS_601L = "spec:width=720,height=1440,unit=px,dpi=320"

  }
