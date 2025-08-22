package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HYUNDAI device specifications for Android Compose previews.
 *
 * This extension provides HYUNDAI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HYUNDAI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HYUNDAI: Any
  get() = object {
      /** DeviceSpec(manufacturer=HYUNDAI, code=bruno, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=bruno, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BRUNO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HYUNDAI, code=capitolhill, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=capitolhill,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val CAPITOLHILL = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HYUNDAI, code=E435_Plus, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=E435_Plus, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val E435_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HYUNDAI, code=E465GO, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=E465GO, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val E465GO = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HYUNDAI, code=E475, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=E475, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val E475 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HYUNDAI, code=E485, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=E485, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val E485 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HYUNDAI, code=e502, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=e502, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val E502 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=E506, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=E506, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val E506 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=HYUNDAI, code=e551_Lite, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=e551_Lite, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val E551_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=E553, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=E553, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val E553 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HYUNDAI, code=E554, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=E554, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val E554 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=HYUNDAI, code=E601F, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=E601F, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val E601F = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=E602, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=E602, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val E602 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=E603, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=E603, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val E603 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HYUNDAI, code=Eternity_G25, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=Eternity_G25,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val ETERNITY_G25 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HYUNDAI, code=gangbyeon, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=gangbyeon,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val GANGBYEON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=hanyang, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=hanyang, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HANYANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=HDIT_IFPD, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=HDIT_IFPD,
      width=2160, height=3840, dpi=480, isGoogleDevice=false).code */
      val HDIT_IFPD = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HYUNDAI, code=hongkong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=hongkong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=HT0703W08, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=HT0703W08, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val HT0703W08 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HYUNDAI, code=HT10LA1MSGNA02, width=1200, height=1920, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=HT10LA1MSGNA02,
      width=1200, height=1920, dpi=360, isGoogleDevice=false).code */
      val HT10LA1MSGNA02 = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=HYUNDAI, code=HT10LB2MBKLTM02, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=HT10LB2MBKLTM02,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val HT10LB2MBKLTM02 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=HYUNDAI, code=HT10WB2MSG01, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=HT10WB2MSG01,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val HT10WB2MSG01 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=HYUNDAI, code=HT7GB1MBK_, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=HT7GB1MBK_,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val HT7GB1MBK = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HYUNDAI, code=HT8WB1RBK01, width=1200, height=1920, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=HT8WB1RBK01,
      width=1200, height=1920, dpi=300, isGoogleDevice=false).code */
      val HT8WB1RBK01 = "spec:width=1200,height=1920,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=HYUNDAI, code=HYUNDAI_Ultra_Live_II, width=1080, height=1920,
      dpi=480, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI,
      code=HYUNDAI_Ultra_Live_II, width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val HYUNDAI_ULTRA_LIVE_II = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HYUNDAI, code=HY_BDL163G_001_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=HY_BDL163G_001_EEA,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val HY_BDL163G_001_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HYUNDAI, code=kenton, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=kenton, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KENTON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=keoneae, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=keoneae, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=L465, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=L465, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val L465 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HYUNDAI, code=L503F, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=L503F, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val L503F = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HYUNDAI, code=L503F_Plus, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=L503F_Plus,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val L503F_PLUS = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HYUNDAI, code=L506, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=L506, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val L506 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=HYUNDAI, code=L553, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=L553, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val L553 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HYUNDAI, code=L601F, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=L601F, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val L601F = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=L604, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=L604, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val L604 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HYUNDAI, code=L610, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=L610, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val L610 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=HYUNDAI, code=L622, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=L622, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val L622 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=HYUNDAI, code=L651, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=L651, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val L651 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=L681, width=720, height=1640, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=L681, width=720,
      height=1640, dpi=260, isGoogleDevice=false).code */
      val L681 = "spec:width=720,height=1640,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=HYUNDAI, code=lasalle, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=lasalle, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HYUNDAI, code=lavender, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=lavender, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=marina, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=marina, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=mountbaker, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=mountbaker,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HYUNDAI, code=nagata, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=nagata, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HYUNDAI, code=nippori, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=nippori, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NIPPORI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HYUNDAI, code=R1, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=R1, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HYUNDAI, code=R2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=R2, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=R3, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=R3, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HYUNDAI, code=R4, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=R4, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=redwood, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=redwood, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HYUNDAI, code=samseong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=samseong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=Seoul_9, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=Seoul_9, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SEOUL_9 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HYUNDAI, code=Seoul_S8, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=Seoul_S8, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SEOUL_S8 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=stanford, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=stanford, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HYUNDAI, code=sunnyvale, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=sunnyvale, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SUNNYVALE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HYUNDAI, code=SW4H, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=SW4H, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=SW6H, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=SW6H, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HYUNDAI, code=tamachi, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=tamachi, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Active, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Active,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ULTRA_ACTIVE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Dream, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Dream,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val ULTRA_DREAM = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Energy_Lite, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Energy_Lite,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val ULTRA_ENERGY_LITE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Energy_Plus, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Energy_Plus,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ULTRA_ENERGY_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Latitude, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Latitude,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ULTRA_LATITUDE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Shadow, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Shadow,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ULTRA_SHADOW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Shine, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Shine,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ULTRA_SHINE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Storm, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Storm,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val ULTRA_STORM = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Style, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Style,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val ULTRA_STYLE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Sync, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Sync,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val ULTRA_SYNC = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Trend, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Trend,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ULTRA_TREND = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Vision, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Vision,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val ULTRA_VISION = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Vision_Plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=Ultra_Vision_Plus,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val ULTRA_VISION_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=yeongdeungpo, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=yeongdeungpo,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HYUNDAI, code=7WA1, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYUNDAI, code=7WA1, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val _7WA1 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
