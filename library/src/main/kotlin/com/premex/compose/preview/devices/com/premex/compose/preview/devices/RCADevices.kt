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
 * @Preview(device = Devices.RCA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RCA: Any
  get() = object {
      /** DeviceSpec(manufacturer=RCA, code=capitolhill, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=capitolhill, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CAPITOLHILL = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=RCA, code=DRP2091, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=DRP2091, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val DRP2091 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=DRP2091Q, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=DRP2091Q, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val DRP2091Q = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=DRP29101QD, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=DRP29101QD, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val DRP29101QD = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=elliniko, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=elliniko, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val ELLINIKO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RCA, code=gangbyeon, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=gangbyeon, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val GANGBYEON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RCA, code=hongkong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=hongkong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RCA, code=kanda, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=kanda, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KANDA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=RCA, code=kenton, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=kenton, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KENTON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RCA, code=keoneae, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=keoneae, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RCA, code=lasalle, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=lasalle, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=RCA, code=lavender, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=lavender, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RCA, code=marina, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=marina, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RCA, code=mountbaker, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=mountbaker, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=RCA, code=nagata, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=nagata, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=RCA, code=osaki, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=osaki, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val OSAKI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=RCA, code=RAKR30824, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RAKR30824, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val RAKR30824 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=RCA, code=RATM20831, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RATM20831, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RATM20831 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RATM21036, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RATM21036, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val RATM21036 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=RCA, code=RATM30846, width=800, height=1340, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RATM30846, width=800,
      height=1340, dpi=160, isGoogleDevice=false).code */
      val RATM30846 = "spec:width=800,height=1340,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RATM31046, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RATM31046, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val RATM31046 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=RCA, code=RATM3144B, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RATM3144B, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val RATM3144B = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=RCA, code=RATR30824, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RATR30824, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val RATR30824 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=RCA, code=RATR31024, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RATR31024, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val RATR31024 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=RCA, code=RC10T3G21, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RC10T3G21, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RC10T3G21 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RC10TB, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RC10TB, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val RC10TB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=RCA, code=RC7T3G21, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RC7T3G21, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val RC7T3G21 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RC8T3G21, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RC8T3G21, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val RC8T3G21 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=RCA, code=RCARENO5011619, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCARENO5011619,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val RCARENO5011619 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=RCA, code=RCA_G2, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCA_G2, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val RCA_G2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=RCA, code=RCA_Reno_Max, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCA_Reno_Max, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val RCA_RENO_MAX = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=RCA, code=RCS13101T, width=480, height=800, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCS13101T, width=480,
      height=800, dpi=120, isGoogleDevice=false).code */
      val RCS13101T = "spec:width=480,height=800,unit=px,dpi=120"

      /** DeviceSpec(manufacturer=RCA, code=RCT6103W46, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6103W46, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6103W46 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6203W46, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6203W46, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6203W46 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6203W46L, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6203W46L, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6203W46L = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6213W22, width=768, height=1368, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6213W22, width=768,
      height=1368, dpi=160, isGoogleDevice=false).code */
      val RCT6213W22 = "spec:width=768,height=1368,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6213W23, width=768, height=1368, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6213W23, width=768,
      height=1368, dpi=160, isGoogleDevice=false).code */
      val RCT6213W23 = "spec:width=768,height=1368,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6213W24, width=768, height=1368, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6213W24, width=768,
      height=1368, dpi=160, isGoogleDevice=false).code */
      val RCT6213W24 = "spec:width=768,height=1368,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6213W87DK, width=768, height=1368, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6213W87DK, width=768,
      height=1368, dpi=160, isGoogleDevice=false).code */
      val RCT6213W87DK = "spec:width=768,height=1368,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6223W87, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6223W87, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val RCT6223W87 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=RCA, code=RCT6223W97, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6223W97, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val RCT6223W97 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=RCA, code=RCT6272W23, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6272W23, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6272W23 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6303W87DK, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6303W87DK, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6303W87DK = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6303W87M, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6303W87M, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6303W87M = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6303W87M7, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6303W87M7, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6303W87M7 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6378W2, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6378W2, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val RCT6378W2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=RCA, code=RCT6513W87, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6513W87, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6513W87 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6513W87DK5e, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6513W87DK5e,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6513W87DK5E = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6513W87DK5eQ, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6513W87DK5eQ,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6513W87DK5EQ = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6513W87DK5eQe, width=768, height=1368, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6513W87DK5eQe,
      width=768, height=1368, dpi=160, isGoogleDevice=false).code */
      val RCT6513W87DK5EQE = "spec:width=768,height=1368,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6513W87DK5eQm, width=768, height=1368, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6513W87DK5eQm,
      width=768, height=1368, dpi=160, isGoogleDevice=false).code */
      val RCT6513W87DK5EQM = "spec:width=768,height=1368,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6573W23, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6573W23, width=768,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6573W23 = "spec:width=768,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6603W47M7, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6603W47M7, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6603W47M7 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6603W87M7, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6603W87M7, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6603W87M7 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6613W23P, width=768, height=1368, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6613W23P, width=768,
      height=1368, dpi=160, isGoogleDevice=false).code */
      val RCT6613W23P = "spec:width=768,height=1368,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6613W23PG, width=768, height=1366, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6613W23PG, width=768,
      height=1366, dpi=160, isGoogleDevice=false).code */
      val RCT6613W23PG = "spec:width=768,height=1366,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6613W23PU, width=768, height=1368, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6613W23PU, width=768,
      height=1368, dpi=160, isGoogleDevice=false).code */
      val RCT6613W23PU = "spec:width=768,height=1368,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6613W23Q, width=768, height=1368, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6613W23Q, width=768,
      height=1368, dpi=160, isGoogleDevice=false).code */
      val RCT6613W23Q = "spec:width=768,height=1368,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6703W12, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6703W12, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6703W12 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6703W13, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6703W13, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6703W13 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6716Q23, width=768, height=1368, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6716Q23, width=768,
      height=1368, dpi=160, isGoogleDevice=false).code */
      val RCT6716Q23 = "spec:width=768,height=1368,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6716Q24, width=768, height=1368, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6716Q24, width=768,
      height=1368, dpi=160, isGoogleDevice=false).code */
      val RCT6716Q24 = "spec:width=768,height=1368,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6716Q25, width=768, height=1368, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6716Q25, width=768,
      height=1368, dpi=160, isGoogleDevice=false).code */
      val RCT6716Q25 = "spec:width=768,height=1368,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6773W22, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6773W22, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6773W22 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6773W22B, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6773W22B, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6773W22B = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6773W42B, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6773W42B, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6773W42B = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6873W42, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6873W42, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6873W42 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6873W42BMF8, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6873W42BMF8,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6873W42BMF8 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6873W42BMF8KC, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6873W42BMF8KC,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6873W42BMF8KC = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6873W42BMF8QE, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6873W42BMF8QE,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6873W42BMF8QE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6873W42BMF9A, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6873W42BMF9A,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6873W42BMF9A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6873W42BMF9E, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6873W42BMF9E,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6873W42BMF9E = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6873W42M, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6873W42M, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6873W42M = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6873W42M_F7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6873W42M_F7,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6873W42M_F7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6876Q22N, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6876Q22N, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6876Q22N = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6973MDN, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6973MDN, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6973MDN = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6973W43, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6973W43, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6973W43 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6973W43MD, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6973W43MD, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6973W43MD = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6973W43MDEU, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6973W43MDEU,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6973W43MDEU = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6973W43R, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6973W43R, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val RCT6973W43R = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6A03W12, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6A03W12, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6A03W12 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6A03W12EU, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6A03W12EU, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6A03W12EU = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6A03W13, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6A03W13, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6A03W13 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6A03W13E, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6A03W13E, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6A03W13E = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6A03W13FU, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6A03W13FU, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6A03W13FU = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6A03W13M, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6A03W13M, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6A03W13M = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6A06E12, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6A06E12, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6A06E12 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6A06Q22, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6A06Q22, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6A06Q22 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6B03Q23, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6B03Q23, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6B03Q23 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6B03W12, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6B03W12, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6B03W12 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6B03W13, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6B03W13, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6B03W13 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6B06P23, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6B06P23, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6B06P23 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6B06Q23, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6B06Q23, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6B06Q23 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6B83W12, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6B83W12, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6B83W12 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6B86E12, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6B86E12, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6B86E12 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6K03W13, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6K03W13, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6K03W13 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6S03W12, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6S03W12, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6S03W12 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6S03W14, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6S03W14, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6S03W14 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6T06E13, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6T06E13, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RCT6T06E13 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RCA, code=RCT6T48Q35, width=1080, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RCT6T48Q35, width=1080,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val RCT6T48Q35 = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=RCA, code=RENO_NAPA, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=RENO_NAPA, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val RENO_NAPA = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=RCA, code=Reno_Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=Reno_Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val RENO_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RCA, code=seocho, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=seocho, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEOCHO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RCA, code=TAB_One, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=TAB_One, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_ONE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=RCA, code=TAB_One_Plus, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=TAB_One_Plus, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_ONE_PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=RCA, code=Tab_Pro, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=Tab_Pro, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val TAB_PRO = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=RCA, code=ueno, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RCA, code=ueno, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val UENO = "spec:width=720,height=1280,unit=px,dpi=213"

  }
