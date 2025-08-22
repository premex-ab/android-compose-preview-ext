package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mione device specifications for Android Compose previews.
 *
 * This extension provides Mione device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mione.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mione: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mione, code=MIONEI, width=720, height=1560, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mione, code=MIONEI, width=720,
      height=1560, dpi=240, isGoogleDevice=false).code */
      val MIONEI = "spec:width=720,height=1560,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mione, code=Mione_Pro_Plus, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mione, code=Mione_Pro_Plus,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val MIONE_PRO_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mione, code=mione_S20, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mione, code=mione_S20, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val MIONE_S20 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mione, code=M-701Plus, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mione, code=M-701Plus, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val M_701PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

  }
