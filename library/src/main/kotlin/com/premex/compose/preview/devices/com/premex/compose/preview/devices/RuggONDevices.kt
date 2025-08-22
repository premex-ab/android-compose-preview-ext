package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RuggON device specifications for Android Compose previews.
 *
 * This extension provides RuggON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RuggON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RuggON: Any
  get() = object {
      /** DeviceSpec(manufacturer=RuggON, code=PA501BG, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RuggON, code=PA501BG, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val PA501BG = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=RuggON, code=PA501BWR, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RuggON, code=PA501BWR, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val PA501BWR = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
