package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RCA device specifications for Android Compose previews.
 *
 * This extension provides RCA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rca.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rca: Any
  get() = object {
      /** RCA capitolhill */
      val CAPITOLHILL = "spec:width=720,height=1280,unit=px,dpi=213"

      /** RCA DRP2091 */
      val DRP2091 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA DRP2091Q */
      val DRP2091Q = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA DRP29101QD */
      val DRP29101QD = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA elliniko */
      val ELLINIKO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** RCA gangbyeon */
      val GANGBYEON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** RCA hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** RCA kanda */
      val KANDA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** RCA kenton */
      val KENTON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** RCA keoneae */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** RCA lasalle */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** RCA lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** RCA marina */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** RCA mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** RCA nagata */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** RCA osaki */
      val OSAKI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** RCA RAKR30824 */
      val RAKR30824 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** RCA RATM20831 */
      val RATM20831 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RATM21036 */
      val RATM21036 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** RCA RATM30846 */
      val RATM30846 = "spec:width=800,height=1340,unit=px,dpi=160"

      /** RCA RATM31046 */
      val RATM31046 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** RCA RATM3144B */
      val RATM3144B = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** RCA RATR30824 */
      val RATR30824 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** RCA RATR31024 */
      val RATR31024 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** RCA RC10T3G21 */
      val RC10T3G21 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RC10TB */
      val RC10TB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** RCA RC7T3G21 */
      val RC7T3G21 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RC8T3G21 */
      val RC8T3G21 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** RCA RCARENO5011619 */
      val RCARENO5011619 = "spec:width=480,height=960,unit=px,dpi=213"

      /** RCA RCA_G2 */
      val RCA_G2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** RCA RCA_Reno_Max */
      val RCA_RENO_MAX = "spec:width=720,height=1600,unit=px,dpi=280"

      /** RCA RCS13101T */
      val RCS13101T = "spec:width=480,height=800,unit=px,dpi=120"

      /** RCA RCT6103W46 */
      val RCT6103W46 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6203W46 */
      val RCT6203W46 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6203W46L */
      val RCT6203W46L = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6213W22 */
      val RCT6213W22 = "spec:width=768,height=1368,unit=px,dpi=160"

      /** RCA RCT6213W23 */
      val RCT6213W23 = "spec:width=768,height=1368,unit=px,dpi=160"

      /** RCA RCT6213W24 */
      val RCT6213W24 = "spec:width=768,height=1368,unit=px,dpi=160"

      /** RCA RCT6213W87DK */
      val RCT6213W87DK = "spec:width=768,height=1368,unit=px,dpi=160"

      /** RCA RCT6223W87 */
      val RCT6223W87 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** RCA RCT6223W97 */
      val RCT6223W97 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** RCA RCT6272W23 */
      val RCT6272W23 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6303W87DK */
      val RCT6303W87DK = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6303W87M */
      val RCT6303W87M = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6303W87M7 */
      val RCT6303W87M7 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6378W2 */
      val RCT6378W2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** RCA RCT6513W87 */
      val RCT6513W87 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6513W87DK5e */
      val RCT6513W87DK5E = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6513W87DK5eQ */
      val RCT6513W87DK5EQ = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6513W87DK5eQe */
      val RCT6513W87DK5EQE = "spec:width=768,height=1368,unit=px,dpi=160"

      /** RCA RCT6513W87DK5eQm */
      val RCT6513W87DK5EQM = "spec:width=768,height=1368,unit=px,dpi=160"

      /** RCA RCT6573W23 */
      val RCT6573W23 = "spec:width=768,height=1024,unit=px,dpi=160"

      /** RCA RCT6603W47M7 */
      val RCT6603W47M7 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6603W87M7 */
      val RCT6603W87M7 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6613W23P */
      val RCT6613W23P = "spec:width=768,height=1368,unit=px,dpi=160"

      /** RCA RCT6613W23PG */
      val RCT6613W23PG = "spec:width=768,height=1366,unit=px,dpi=160"

      /** RCA RCT6613W23PU */
      val RCT6613W23PU = "spec:width=768,height=1368,unit=px,dpi=160"

      /** RCA RCT6613W23Q */
      val RCT6613W23Q = "spec:width=768,height=1368,unit=px,dpi=160"

      /** RCA RCT6703W12 */
      val RCT6703W12 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6703W13 */
      val RCT6703W13 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6716Q23 */
      val RCT6716Q23 = "spec:width=768,height=1368,unit=px,dpi=160"

      /** RCA RCT6716Q24 */
      val RCT6716Q24 = "spec:width=768,height=1368,unit=px,dpi=160"

      /** RCA RCT6716Q25 */
      val RCT6716Q25 = "spec:width=768,height=1368,unit=px,dpi=160"

      /** RCA RCT6773W22 */
      val RCT6773W22 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6773W22B */
      val RCT6773W22B = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6773W42B */
      val RCT6773W42B = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6873W42 */
      val RCT6873W42 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6873W42BMF8 */
      val RCT6873W42BMF8 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6873W42BMF8KC */
      val RCT6873W42BMF8KC = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6873W42BMF8QE */
      val RCT6873W42BMF8QE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6873W42BMF9A */
      val RCT6873W42BMF9A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6873W42BMF9E */
      val RCT6873W42BMF9E = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6873W42M */
      val RCT6873W42M = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6873W42M_F7 */
      val RCT6873W42M_F7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6876Q22N */
      val RCT6876Q22N = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6973MDN */
      val RCT6973MDN = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6973W43 */
      val RCT6973W43 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6973W43MD */
      val RCT6973W43MD = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6973W43MDEU */
      val RCT6973W43MDEU = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6973W43R */
      val RCT6973W43R = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RCA RCT6A03W12 */
      val RCT6A03W12 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6A03W12EU */
      val RCT6A03W12EU = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6A03W13 */
      val RCT6A03W13 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6A03W13E */
      val RCT6A03W13E = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6A03W13FU */
      val RCT6A03W13FU = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6A03W13M */
      val RCT6A03W13M = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6A06E12 */
      val RCT6A06E12 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6A06Q22 */
      val RCT6A06Q22 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6B03Q23 */
      val RCT6B03Q23 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6B03W12 */
      val RCT6B03W12 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6B03W13 */
      val RCT6B03W13 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6B06P23 */
      val RCT6B06P23 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6B06Q23 */
      val RCT6B06Q23 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6B83W12 */
      val RCT6B83W12 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6B86E12 */
      val RCT6B86E12 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6K03W13 */
      val RCT6K03W13 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6S03W12 */
      val RCT6S03W12 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6S03W14 */
      val RCT6S03W14 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6T06E13 */
      val RCT6T06E13 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** RCA RCT6T48Q35 */
      val RCT6T48Q35 = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** RCA RENO_NAPA */
      val RENO_NAPA = "spec:width=480,height=960,unit=px,dpi=213"

      /** RCA Reno_Pro */
      val RENO_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** RCA seocho */
      val SEOCHO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** RCA TAB_One */
      val TAB_ONE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** RCA TAB_One_Plus */
      val TAB_ONE_PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** RCA Tab_Pro */
      val TAB_PRO = "spec:width=800,height=1280,unit=px,dpi=180"

      /** RCA ueno */
      val UENO = "spec:width=720,height=1280,unit=px,dpi=213"

  }
