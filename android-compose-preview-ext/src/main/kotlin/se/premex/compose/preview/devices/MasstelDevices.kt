package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

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
      /** Masstel Masstel_Hapi_15 */
      val MASSTEL_HAPI_15 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Masstel Masstel_Hapi_20 */
      val MASSTEL_HAPI_20 = "spec:width=720,height=1520,unit=px,dpi=300"

      /** Masstel Masstel_Hapi_30 */
      val MASSTEL_HAPI_30 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Masstel Masstel_S7 */
      val MASSTEL_S7 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Masstel Masstel_S9 */
      val MASSTEL_S9 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** Masstel Masstel_Tab10 */
      val MASSTEL_TAB10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Masstel Masstel_Tab10_4G */
      val MASSTEL_TAB10_4G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Masstel Masstel_Tab10_WiFi */
      val MASSTEL_TAB10_WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Masstel Masstel_Tab11_Pro_4G */
      val MASSTEL_TAB11_PRO_4G = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Masstel Masstel_Tab8 */
      val MASSTEL_TAB8 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Masstel Masstel_Tab8_4G */
      val MASSTEL_TAB8_4G = "spec:width=800,height=1280,unit=px,dpi=214"

      /** Masstel Masstel_Tab8_Edu */
      val MASSTEL_TAB8_EDU = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Masstel Masstel_Tab_101 */
      val MASSTEL_TAB_101 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Masstel Masstel_Tab_101Pro */
      val MASSTEL_TAB_101PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Masstel Masstel_Tab_104 */
      val MASSTEL_TAB_104 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Masstel Masstel_Tab_10E */
      val MASSTEL_TAB_10E = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Masstel Masstel_Tab_10M */
      val MASSTEL_TAB_10M = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Masstel Masstel_Tab_10S */
      val MASSTEL_TAB_10S = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Masstel Masstel_Tab_82 */
      val MASSTEL_TAB_82 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Masstel Masstel_Tab_83 */
      val MASSTEL_TAB_83 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Masstel Masstel_X6 */
      val MASSTEL_X6 = "spec:width=540,height=1132,unit=px,dpi=240"

      /** Masstel Masstel_X8 */
      val MASSTEL_X8 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Masstel Tab10Ultra */
      val TAB10ULTRA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Masstel Tab10_Edu */
      val TAB10_EDU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Masstel Tab10_EduV2 */
      val TAB10_EDUV2 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** Masstel Tab7Plus */
      val TAB7PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Masstel Tab8Plus */
      val TAB8PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Masstel Tab8Pro */
      val TAB8PRO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Masstel Tab_10A */
      val TAB_10A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Masstel Tab_81 */
      val TAB_81 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Masstel Tab_8A */
      val TAB_8A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Masstel 3G_Tablet_PC */
      val _3G_TABLET_PC = "spec:width=600,height=1024,unit=px,dpi=160"

  }
