package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WS device specifications for Android Compose previews.
 *
 * This extension provides WS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WS: Any
  get() = object {
      /** DeviceSpec(manufacturer=WS, code=TD-TP010G-2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WS, code=TD-TP010G-2, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TD_TP010G_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=WS, code=WS-T01, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WS, code=WS-T01, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val WS_T01 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
