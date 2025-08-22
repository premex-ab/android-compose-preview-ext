package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SKY device specifications for Android Compose previews.
 *
 * This extension provides SKY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SKY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SKY: Any
  get() = object {
      /** DeviceSpec(manufacturer=SKY, code=ef71g, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=ef71g, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val EF71G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SKY, code=ef71k, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=ef71k, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val EF71K = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SKY, code=ef71s, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=ef71s, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val EF71S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SKY, code=Elite_4T_GT, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_4T_GT, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val ELITE_4T_GT = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SKY, code=Elite_A6, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_A6, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val ELITE_A6 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SKY, code=Elite_A63, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_A63, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val ELITE_A63 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SKY, code=Elite_B5MS, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_B5MS, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ELITE_B5MS = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SKY, code=Elite_C55, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_C55, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ELITE_C55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SKY, code=Elite_C55US, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_C55US, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ELITE_C55US = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SKY, code=Elite_C55USA, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_C55USA, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ELITE_C55USA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SKY, code=Elite_M45, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_M45, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ELITE_M45 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SKY, code=Elite_M5Plus_PA, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_M5Plus_PA,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val ELITE_M5PLUS_PA = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SKY, code=Elite_M5Plus_SAL, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_M5Plus_SAL,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val ELITE_M5PLUS_SAL = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SKY, code=Elite_N55Max, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_N55Max, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val ELITE_N55MAX = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=SKY, code=Elite_OctaPlus3us, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_OctaPlus3us,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ELITE_OCTAPLUS3US = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SKY, code=Elite_OctaPlusKK1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_OctaPlusKK1,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ELITE_OCTAPLUSKK1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SKY, code=Elite_OctaX, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_OctaX, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val ELITE_OCTAX = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SKY, code=Elite_OctaXK, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_OctaXK, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val ELITE_OCTAXK = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SKY, code=Elite_OctaXK2, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_OctaXK2, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val ELITE_OCTAXK2 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SKY, code=Elite_OctaXkk3, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_OctaXkk3,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val ELITE_OCTAXKK3 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SKY, code=Elite_OctaXS, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_OctaXS, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ELITE_OCTAXS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SKY, code=Elite_Octa_Plus, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_Octa_Plus,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val ELITE_OCTA_PLUS = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SKY, code=Elite_PAD8USA, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_PAD8USA, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val ELITE_PAD8USA = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SKY, code=Elite_T4, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_T4, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val ELITE_T4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SKY, code=Elite_T6, width=600, height=1280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_T6, width=600,
      height=1280, dpi=280, isGoogleDevice=false).code */
      val ELITE_T6 = "spec:width=600,height=1280,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SKY, code=Elite_T8PlusK, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_T8PlusK, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ELITE_T8PLUSK = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SKY, code=Elite_T8Pluss, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Elite_T8Pluss, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ELITE_T8PLUSS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SKY, code=HY40A, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=HY40A, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HY40A = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SKY, code=Platinum_A57_OP, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=Platinum_A57_OP,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val PLATINUM_A57_OP = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SKY, code=PRO_SELFIE, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=PRO_SELFIE, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PRO_SELFIE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SKY, code=SKY_KIDsPro, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=SKY_KIDsPro, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val SKY_KIDSPRO = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=SKY, code=SKY_PAD10, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=SKY_PAD10, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val SKY_PAD10 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=SKY, code=SKY_Pad10k, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=SKY_Pad10k, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val SKY_PAD10K = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=SKY, code=SKY_PAD10Maxk1, width=800, height=1280, dpi=190,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=SKY_PAD10Maxk1,
      width=800, height=1280, dpi=190, isGoogleDevice=false).code */
      val SKY_PAD10MAXK1 = "spec:width=800,height=1280,unit=px,dpi=190"

      /** DeviceSpec(manufacturer=SKY, code=SKY_PAD10Maxk2, width=800, height=1280, dpi=190,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=SKY_PAD10Maxk2,
      width=800, height=1280, dpi=190, isGoogleDevice=false).code */
      val SKY_PAD10MAXK2 = "spec:width=800,height=1280,unit=px,dpi=190"

      /** DeviceSpec(manufacturer=SKY, code=SKY_PAD10Maxk3, width=800, height=1280, dpi=190,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=SKY_PAD10Maxk3,
      width=800, height=1280, dpi=190, isGoogleDevice=false).code */
      val SKY_PAD10MAXK3 = "spec:width=800,height=1280,unit=px,dpi=190"

      /** DeviceSpec(manufacturer=SKY, code=SKY_PAD10MaxNUS, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=SKY_PAD10MaxNUS,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val SKY_PAD10MAXNUS = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=SKY, code=SKY_PAD10MaxOPM, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=SKY_PAD10MaxOPM,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val SKY_PAD10MAXOPM = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=SKY, code=SKY_PAD10us, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=SKY_PAD10us, width=800,
      height=1280, dpi=220, isGoogleDevice=false).code */
      val SKY_PAD10US = "spec:width=800,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=SKY, code=SKY_PAD8, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=SKY_PAD8, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val SKY_PAD8 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SKY, code=SKY_PAD8Pro, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=SKY_PAD8Pro, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val SKY_PAD8PRO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SKY, code=SKY_PAD8PROUS, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=SKY_PAD8PROUS, width=800,
      height=1280, dpi=220, isGoogleDevice=false).code */
      val SKY_PAD8PROUS = "spec:width=800,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=SKY, code=SKY_PAX10US, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=SKY_PAX10US, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val SKY_PAX10US = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=SKY, code=SKY_Prestige, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=SKY_Prestige, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SKY_PRESTIGE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SKY, code=SKY_Prestige2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=SKY_Prestige2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SKY_PRESTIGE2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SKY, code=SKY_VISION2_Plus, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY, code=SKY_VISION2_Plus,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SKY_VISION2_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

  }
