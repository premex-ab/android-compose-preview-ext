package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * COBY device specifications for Android Compose previews.
 *
 * This extension provides COBY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.COBY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.COBY: Any
  get() = object {
      /** DeviceSpec(manufacturer=COBY, code=MID7052, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COBY, code=MID7052, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MID7052 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=COBY, code=MID8072, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COBY, code=MID8072, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MID8072 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
