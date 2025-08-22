package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Bundy device specifications for Android Compose previews.
 *
 * This extension provides Bundy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bundy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bundy: Any
  get() = object {
      /** DeviceSpec(manufacturer=Bundy, code=BTOUCH7_PLUS, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bundy, code=BTOUCH7_PLUS,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val BTOUCH7_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

  }
