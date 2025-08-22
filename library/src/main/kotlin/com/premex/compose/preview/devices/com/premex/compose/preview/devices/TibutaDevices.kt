package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Tibuta device specifications for Android Compose previews.
 *
 * This extension provides Tibuta device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tibuta.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tibuta: Any
  get() = object {
      /** DeviceSpec(manufacturer=Tibuta, code=A30, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tibuta, code=A30, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val A30 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Tibuta, code=A40, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tibuta, code=A40, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val A40 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Tibuta, code=E101, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tibuta, code=E101, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E101 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Tibuta, code=SmartPad_E220, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tibuta, code=SmartPad_E220,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SMARTPAD_E220 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Tibuta, code=TAB_868_PRO, width=800, height=1340, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tibuta, code=TAB_868_PRO,
      width=800, height=1340, dpi=240, isGoogleDevice=false).code */
      val TAB_868_PRO = "spec:width=800,height=1340,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Tibuta, code=Tibuta_MasterPad-E100, width=800, height=1280,
      dpi=186, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tibuta,
      code=Tibuta_MasterPad-E100, width=800, height=1280, dpi=186, isGoogleDevice=false).code */
      val TIBUTA_MASTERPAD_E100 = "spec:width=800,height=1280,unit=px,dpi=186"

      /** DeviceSpec(manufacturer=Tibuta, code=Tibuta_MasterPad_K100, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tibuta,
      code=Tibuta_MasterPad_K100, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TIBUTA_MASTERPAD_K100 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
