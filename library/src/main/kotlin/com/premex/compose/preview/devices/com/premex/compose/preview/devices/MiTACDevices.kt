package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MiTAC device specifications for Android Compose previews.
 *
 * This extension provides MiTAC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MiTAC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MiTAC: Any
  get() = object {
      /** DeviceSpec(manufacturer=MiTAC, code=chiron_pro, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MiTAC, code=chiron_pro, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val CHIRON_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MiTAC, code=hera_pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MiTAC, code=hera_pro, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HERA_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MiTAC, code=surfing_pro, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MiTAC, code=surfing_pro, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SURFING_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

  }
