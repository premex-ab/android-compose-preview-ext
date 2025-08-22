package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Masstel device specifications for Android Compose previews.
 *
 * This extension provides Masstel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Masstel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Masstel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Masstel, code=Masstel_Hapi_15, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Masstel_Hapi_15,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val MASSTEL_HAPI_15 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Masstel, code=Masstel_Hapi_20, width=720, height=1520, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Masstel_Hapi_20,
      width=720, height=1520, dpi=300, isGoogleDevice=false).code */
      val MASSTEL_HAPI_20 = "spec:width=720,height=1520,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=Masstel, code=Masstel_Hapi_30, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Masstel_Hapi_30,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val MASSTEL_HAPI_30 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Masstel, code=Masstel_S7, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Masstel_S7,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val MASSTEL_S7 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Masstel, code=Masstel_S9, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Masstel_S9,
      width=720, height=1600, dpi=480, isGoogleDevice=false).code */
      val MASSTEL_S9 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Masstel, code=Masstel_Tab10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Masstel_Tab10,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val MASSTEL_TAB10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Masstel, code=Masstel_Tab10_4G, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Masstel_Tab10_4G,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val MASSTEL_TAB10_4G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Masstel, code=Masstel_Tab10_WiFi, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Masstel_Tab10_WiFi,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val MASSTEL_TAB10_WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Masstel, code=Masstel_Tab11_Pro_4G, width=1200, height=1920,
      dpi=280, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel,
      code=Masstel_Tab11_Pro_4G, width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val MASSTEL_TAB11_PRO_4G = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Masstel, code=Masstel_Tab8, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Masstel_Tab8,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val MASSTEL_TAB8 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Masstel, code=Masstel_Tab8_4G, width=800, height=1280, dpi=214,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Masstel_Tab8_4G,
      width=800, height=1280, dpi=214, isGoogleDevice=false).code */
      val MASSTEL_TAB8_4G = "spec:width=800,height=1280,unit=px,dpi=214"

      /** DeviceSpec(manufacturer=Masstel, code=Masstel_Tab8_Edu, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Masstel_Tab8_Edu,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val MASSTEL_TAB8_EDU = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Masstel, code=Masstel_Tab_101, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Masstel_Tab_101,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val MASSTEL_TAB_101 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Masstel, code=Masstel_Tab_101Pro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Masstel_Tab_101Pro,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val MASSTEL_TAB_101PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Masstel, code=Masstel_Tab_104, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Masstel_Tab_104,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val MASSTEL_TAB_104 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Masstel, code=Masstel_Tab_10E, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Masstel_Tab_10E,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val MASSTEL_TAB_10E = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Masstel, code=Masstel_Tab_10M, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Masstel_Tab_10M,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val MASSTEL_TAB_10M = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Masstel, code=Masstel_Tab_10S, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Masstel_Tab_10S,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val MASSTEL_TAB_10S = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Masstel, code=Masstel_Tab_82, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Masstel_Tab_82,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val MASSTEL_TAB_82 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Masstel, code=Masstel_Tab_83, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Masstel_Tab_83,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val MASSTEL_TAB_83 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Masstel, code=Masstel_X6, width=540, height=1132, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Masstel_X6,
      width=540, height=1132, dpi=240, isGoogleDevice=false).code */
      val MASSTEL_X6 = "spec:width=540,height=1132,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Masstel, code=Masstel_X8, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Masstel_X8,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val MASSTEL_X8 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Masstel, code=Tab10Ultra, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Tab10Ultra,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB10ULTRA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Masstel, code=Tab10_Edu, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Tab10_Edu, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB10_EDU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Masstel, code=Tab10_EduV2, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Tab10_EduV2,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val TAB10_EDUV2 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Masstel, code=Tab7Plus, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Tab7Plus, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TAB7PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Masstel, code=Tab8Plus, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Tab8Plus, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB8PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Masstel, code=Tab8Pro, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Tab8Pro, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val TAB8PRO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Masstel, code=Tab_10A, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Tab_10A, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_10A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Masstel, code=Tab_81, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Tab_81, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_81 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Masstel, code=Tab_8A, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=Tab_8A, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_8A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Masstel, code=3G_Tablet_PC, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masstel, code=3G_Tablet_PC,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val _3G_TABLET_PC = "spec:width=600,height=1024,unit=px,dpi=160"

  }
