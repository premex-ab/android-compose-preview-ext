package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SENWA device specifications for Android Compose previews.
 *
 * This extension provides SENWA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SENWA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SENWA: Any
  get() = object {
      /** DeviceSpec(manufacturer=SENWA, code=Senwa_LS5018F, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SENWA, code=Senwa_LS5018F,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val SENWA_LS5018F = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SENWA, code=Senwa_LS5518H, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SENWA, code=Senwa_LS5518H,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val SENWA_LS5518H = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SENWA, code=Senwa_LS5718, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SENWA, code=Senwa_LS5718,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val SENWA_LS5718 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SENWA, code=Senwa_S40, width=480, height=800, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SENWA, code=Senwa_S40, width=480,
      height=800, dpi=220, isGoogleDevice=false).code */
      val SENWA_S40 = "spec:width=480,height=800,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=SENWA, code=Senwa_S471, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SENWA, code=Senwa_S471, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val SENWA_S471 = "spec:width=480,height=800,unit=px,dpi=240"

  }
