package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JOYSURF device specifications for Android Compose previews.
 *
 * This extension provides JOYSURF device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JOYSURF.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JOYSURF: Any
  get() = object {
      /** DeviceSpec(manufacturer=JOYSURF, code=TB-JS100A, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JOYSURF, code=TB-JS100A, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TB_JS100A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=JOYSURF, code=TB-JS101A, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JOYSURF, code=TB-JS101A,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TB_JS101A = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
