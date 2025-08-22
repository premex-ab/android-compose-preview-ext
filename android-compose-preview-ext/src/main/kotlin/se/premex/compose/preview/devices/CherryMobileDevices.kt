package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Cherry_Mobile device specifications for Android Compose previews.
 *
 * This extension provides Cherry_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CherryMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CherryMobile: Any
  get() = object {
      /** Cherry_Mobile A800 */
      val A800 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Cherry_Mobile A820 */
      val A820 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Cherry_Mobile A840 */
      val A840 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Cherry_Mobile A850 */
      val A850 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Cherry_Mobile A860 */
      val A860 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Cherry_Mobile A890 */
      val A890 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Cherry_Mobile A950 */
      val A950 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Cherry_Mobile Aqua_Infinity */
      val AQUA_INFINITY = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Cherry_Mobile Aqua_S10 */
      val AQUA_S10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Cherry_Mobile Aqua_S9 */
      val AQUA_S9 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Cherry_Mobile Aqua_Tab_Ultra */
      val AQUA_TAB_ULTRA = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** Cherry_Mobile Cherry_Flare_S6 */
      val CHERRY_FLARE_S6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Cherry_Mobile Flare_A1_Roam */
      val FLARE_A1_ROAM = "spec:width=480,height=960,unit=px,dpi=240"

      /** Cherry_Mobile Flare_HD_4 */
      val FLARE_HD_4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Cherry_Mobile Flare_HD_5 */
      val FLARE_HD_5 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** Cherry_Mobile Flare_J1_Lite */
      val FLARE_J1_LITE = "spec:width=480,height=854,unit=px,dpi=240"

      /** Cherry_Mobile Flare_J2_Max */
      val FLARE_J2_MAX = "spec:width=480,height=960,unit=px,dpi=240"

      /** Cherry_Mobile Flare_J3s */
      val FLARE_J3S = "spec:width=480,height=960,unit=px,dpi=240"

      /** Cherry_Mobile Flare_J3_Lite */
      val FLARE_J3_LITE = "spec:width=480,height=854,unit=px,dpi=213"

      /** Cherry_Mobile Flare_J3_mini */
      val FLARE_J3_MINI = "spec:width=480,height=960,unit=px,dpi=240"

      /** Cherry_Mobile Flare_J5_Mini */
      val FLARE_J5_MINI = "spec:width=480,height=960,unit=px,dpi=240"

      /** Cherry_Mobile Flare_J6_Plus */
      val FLARE_J6_PLUS = "spec:width=720,height=1500,unit=px,dpi=320"

      /** Cherry_Mobile Flare_J7 */
      val FLARE_J7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Cherry_Mobile Flare_J8_LTE */
      val FLARE_J8_LTE = "spec:width=720,height=1480,unit=px,dpi=320"

      /** Cherry_Mobile Flare_P1_Mini */
      val FLARE_P1_MINI = "spec:width=480,height=800,unit=px,dpi=240"

      /** Cherry_Mobile Flare_P3_lite */
      val FLARE_P3_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** Cherry_Mobile Flare_P3_Plus */
      val FLARE_P3_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Cherry_Mobile Flare_S5 */
      val FLARE_S5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Cherry_Mobile Flare_S5_Plus */
      val FLARE_S5_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Cherry_Mobile Flare_S7 */
      val FLARE_S7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Cherry_Mobile Flare_S7_Lite */
      val FLARE_S7_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** Cherry_Mobile Flare_S7_Max */
      val FLARE_S7_MAX = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Cherry_Mobile Flare_S7_Mini */
      val FLARE_S7_MINI = "spec:width=480,height=960,unit=px,dpi=240"

      /** Cherry_Mobile Flare_S7_Power */
      val FLARE_S7_POWER = "spec:width=480,height=960,unit=px,dpi=240"

      /** Cherry_Mobile Flare_S7_Prime */
      val FLARE_S7_PRIME = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Cherry_Mobile Flare_S8_Deluxe */
      val FLARE_S8_DELUXE = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Cherry_Mobile Flare_X */
      val FLARE_X = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Cherry_Mobile Flare_Y3_mini */
      val FLARE_Y3_MINI = "spec:width=480,height=800,unit=px,dpi=240"

      /** Cherry_Mobile Flare_Y7 */
      val FLARE_Y7 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Cherry_Mobile Flare_Y7_LTE */
      val FLARE_Y7_LTE = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Cherry_Mobile H1950 */
      val H1950 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Cherry_Mobile H2050 */
      val H2050 = "spec:width=444,height=960,unit=px,dpi=213"

      /** Cherry_Mobile Omega_HD_Duo */
      val OMEGA_HD_DUO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Cherry_Mobile Omega_Icon_Lite_2 */
      val OMEGA_ICON_LITE_2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Cherry_Mobile Omega_Lite_3s */
      val OMEGA_LITE_3S = "spec:width=480,height=854,unit=px,dpi=240"

      /** Cherry_Mobile omega_lite_4 */
      val OMEGA_LITE_4 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Cherry_Mobile Superion_S2 */
      val SUPERION_S2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Cherry_Mobile Superion_S2_Plus */
      val SUPERION_S2_PLUS = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Cherry_Mobile X930 */
      val X930 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Cherry_Mobile X960 */
      val X960 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Cherry_Mobile X970 */
      val X970 = "spec:width=1080,height=2244,unit=px,dpi=480"

  }
