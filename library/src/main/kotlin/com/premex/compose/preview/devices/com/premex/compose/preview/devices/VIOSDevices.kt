package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VIOS device specifications for Android Compose previews.
 *
 * This extension provides VIOS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VIOS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VIOS: Any
  get() = object {
      /** DeviceSpec(manufacturer=VIOS, code=VI65PA1402NA, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIOS, code=VI65PA1402NA, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val VI65PA1402NA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VIOS, code=VTAB7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIOS, code=VTAB7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val VTAB7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VIOS, code=VTABX, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIOS, code=VTABX, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val VTABX = "spec:width=800,height=1280,unit=px,dpi=213"

  }
