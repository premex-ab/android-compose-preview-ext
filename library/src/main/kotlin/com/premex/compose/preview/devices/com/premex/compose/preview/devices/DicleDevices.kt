package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dicle device specifications for Android Compose previews.
 *
 * This extension provides Dicle device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dicle.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dicle: Any
  get() = object {
      /** DeviceSpec(manufacturer=Dicle, code=Dicle_Dtab_Active_S, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dicle, code=Dicle_Dtab_Active_S,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val DICLE_DTAB_ACTIVE_S = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dicle, code=Dicle_Dtab_Kpad, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dicle, code=Dicle_Dtab_Kpad,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val DICLE_DTAB_KPAD = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dicle, code=Dicle_Dtab_U1008, width=1280, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dicle, code=Dicle_Dtab_U1008,
      width=1280, height=1920, dpi=320, isGoogleDevice=false).code */
      val DICLE_DTAB_U1008 = "spec:width=1280,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dicle, code=Dicle_Tab_Lite_M, width=800, height=1280, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dicle, code=Dicle_Tab_Lite_M,
      width=800, height=1280, dpi=210, isGoogleDevice=false).code */
      val DICLE_TAB_LITE_M = "spec:width=800,height=1280,unit=px,dpi=210"

      /** DeviceSpec(manufacturer=Dicle, code=DTABPLUS, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dicle, code=DTABPLUS, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val DTABPLUS = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Dicle, code=Tab_MyPen_P1, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dicle, code=Tab_MyPen_P1,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val TAB_MYPEN_P1 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dicle, code=Tab_Ultra, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dicle, code=Tab_Ultra, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val TAB_ULTRA = "spec:width=1200,height=2000,unit=px,dpi=320"

  }
