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
      /** SKY ef71g */
      val EF71G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SKY ef71k */
      val EF71K = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SKY ef71s */
      val EF71S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SKY Elite_4T_GT */
      val ELITE_4T_GT = "spec:width=480,height=800,unit=px,dpi=240"

      /** SKY Elite_A6 */
      val ELITE_A6 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** SKY Elite_A63 */
      val ELITE_A63 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** SKY Elite_B5MS */
      val ELITE_B5MS = "spec:width=540,height=960,unit=px,dpi=240"

      /** SKY Elite_C55 */
      val ELITE_C55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** SKY Elite_C55US */
      val ELITE_C55US = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SKY Elite_C55USA */
      val ELITE_C55USA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SKY Elite_M45 */
      val ELITE_M45 = "spec:width=480,height=854,unit=px,dpi=240"

      /** SKY Elite_M5Plus_PA */
      val ELITE_M5PLUS_PA = "spec:width=480,height=854,unit=px,dpi=240"

      /** SKY Elite_M5Plus_SAL */
      val ELITE_M5PLUS_SAL = "spec:width=480,height=854,unit=px,dpi=240"

      /** SKY Elite_N55Max */
      val ELITE_N55MAX = "spec:width=480,height=960,unit=px,dpi=200"

      /** SKY Elite_OctaPlus3us */
      val ELITE_OCTAPLUS3US = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SKY Elite_OctaPlusKK1 */
      val ELITE_OCTAPLUSKK1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SKY Elite_OctaX */
      val ELITE_OCTAX = "spec:width=800,height=1280,unit=px,dpi=240"

      /** SKY Elite_OctaXK */
      val ELITE_OCTAXK = "spec:width=800,height=1280,unit=px,dpi=240"

      /** SKY Elite_OctaXK2 */
      val ELITE_OCTAXK2 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** SKY Elite_OctaXkk3 */
      val ELITE_OCTAXKK3 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** SKY Elite_OctaXS */
      val ELITE_OCTAXS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SKY Elite_Octa_Plus */
      val ELITE_OCTA_PLUS = "spec:width=800,height=1280,unit=px,dpi=240"

      /** SKY Elite_PAD8USA */
      val ELITE_PAD8USA = "spec:width=800,height=1280,unit=px,dpi=240"

      /** SKY Elite_T4 */
      val ELITE_T4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** SKY Elite_T6 */
      val ELITE_T6 = "spec:width=600,height=1280,unit=px,dpi=280"

      /** SKY Elite_T8PlusK */
      val ELITE_T8PLUSK = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SKY Elite_T8Pluss */
      val ELITE_T8PLUSS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SKY HY40A */
      val HY40A = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SKY Platinum_A57_OP */
      val PLATINUM_A57_OP = "spec:width=480,height=960,unit=px,dpi=240"

      /** SKY PRO_SELFIE */
      val PRO_SELFIE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SKY SKY_KIDsPro */
      val SKY_KIDSPRO = "spec:width=800,height=1280,unit=px,dpi=200"

      /** SKY SKY_PAD10 */
      val SKY_PAD10 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** SKY SKY_Pad10k */
      val SKY_PAD10K = "spec:width=800,height=1280,unit=px,dpi=200"

      /** SKY SKY_PAD10Maxk1 */
      val SKY_PAD10MAXK1 = "spec:width=800,height=1280,unit=px,dpi=190"

      /** SKY SKY_PAD10Maxk2 */
      val SKY_PAD10MAXK2 = "spec:width=800,height=1280,unit=px,dpi=190"

      /** SKY SKY_PAD10Maxk3 */
      val SKY_PAD10MAXK3 = "spec:width=800,height=1280,unit=px,dpi=190"

      /** SKY SKY_PAD10MaxNUS */
      val SKY_PAD10MAXNUS = "spec:width=800,height=1280,unit=px,dpi=200"

      /** SKY SKY_PAD10MaxOPM */
      val SKY_PAD10MAXOPM = "spec:width=800,height=1280,unit=px,dpi=200"

      /** SKY SKY_PAD10us */
      val SKY_PAD10US = "spec:width=800,height=1280,unit=px,dpi=220"

      /** SKY SKY_PAD8 */
      val SKY_PAD8 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** SKY SKY_PAD8Pro */
      val SKY_PAD8PRO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** SKY SKY_PAD8PROUS */
      val SKY_PAD8PROUS = "spec:width=800,height=1280,unit=px,dpi=220"

      /** SKY SKY_PAX10US */
      val SKY_PAX10US = "spec:width=800,height=1280,unit=px,dpi=200"

      /** SKY SKY_Prestige */
      val SKY_PRESTIGE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SKY SKY_Prestige2 */
      val SKY_PRESTIGE2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SKY SKY_VISION2_Plus */
      val SKY_VISION2_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

  }
