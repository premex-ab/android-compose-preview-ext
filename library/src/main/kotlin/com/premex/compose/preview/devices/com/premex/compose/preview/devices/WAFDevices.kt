package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WAF device specifications for Android Compose previews.
 *
 * This extension provides WAF device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WAF.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WAF: Any
  get() = object {
      /** DeviceSpec(manufacturer=WAF, code=F808NM, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WAF, code=F808NM, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val F808NM = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=WAF, code=THMTKAW01216, width=1080, height=2220, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WAF, code=THMTKAW01216, width=1080,
      height=2220, dpi=440, isGoogleDevice=false).code */
      val THMTKAW01216 = "spec:width=1080,height=2220,unit=px,dpi=440"

  }
