package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * COOLFAN device specifications for Android Compose previews.
 *
 * This extension provides COOLFAN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.COOLFAN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.COOLFAN: Any
  get() = object {
      /** DeviceSpec(manufacturer=COOLFAN, code=C107, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COOLFAN, code=C107, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val C107 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=COOLFAN, code=OC106, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COOLFAN, code=OC106, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val OC106 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=COOLFAN, code=OC106_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COOLFAN, code=OC106_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val OC106_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
