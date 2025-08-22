package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CUBOT device specifications for Android Compose previews.
 *
 * This extension provides CUBOT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cubot.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cubot: Any
  get() = object {
      /** CUBOT A1 */
      val A1 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** CUBOT A10 */
      val A10 = "spec:width=720,height=1612,unit=px,dpi=272"

      /** CUBOT A20 */
      val A20 = "spec:width=720,height=1600,unit=px,dpi=260"

      /** CUBOT A30 */
      val A30 = "spec:width=720,height=1600,unit=px,dpi=260"

      /** CUBOT C20 */
      val C20 = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** CUBOT C30 */
      val C30 = "spec:width=1080,height=2310,unit=px,dpi=480"

      /** CUBOT CUBOT_A5 */
      val CUBOT_A5 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** CUBOT CUBOT_CHEETAH_2 */
      val CUBOT_CHEETAH_2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** CUBOT CUBOT_ECHO */
      val CUBOT_ECHO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** CUBOT CUBOT_H3 */
      val CUBOT_H3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** CUBOT CUBOT_J3 */
      val CUBOT_J3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** CUBOT CUBOT_J3_PRO */
      val CUBOT_J3_PRO = "spec:width=480,height=960,unit=px,dpi=240"

      /** CUBOT CUBOT_J9 */
      val CUBOT_J9 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** CUBOT CUBOT_MAGIC */
      val CUBOT_MAGIC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** CUBOT CUBOT_MANITO */
      val CUBOT_MANITO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** CUBOT CUBOT_NOTE_Plus */
      val CUBOT_NOTE_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** CUBOT CUBOT_NOTE_S */
      val CUBOT_NOTE_S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** CUBOT CUBOT_NOVA */
      val CUBOT_NOVA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** CUBOT CUBOT_POWER */
      val CUBOT_POWER = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** CUBOT CUBOT_R11 */
      val CUBOT_R11 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** CUBOT CUBOT_R9 */
      val CUBOT_R9 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** CUBOT CUBOT_X18 */
      val CUBOT_X18 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** CUBOT J10 */
      val J10 = "spec:width=480,height=854,unit=px,dpi=240"

      /** CUBOT J20 */
      val J20 = "spec:width=480,height=854,unit=px,dpi=200"

      /** CUBOT J5 */
      val J5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** CUBOT J7 */
      val J7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** CUBOT J8 */
      val J8 = "spec:width=442,height=960,unit=px,dpi=240"

      /** CUBOT KINGKONGMINI3 */
      val KINGKONGMINI3 = "spec:width=480,height=1170,unit=px,dpi=204"

      /** CUBOT KINGKONG_5 */
      val KINGKONG_5 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** CUBOT KINGKONG_5_Pro */
      val KINGKONG_5_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** CUBOT KINGKONG_6 */
      val KINGKONG_6 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** CUBOT KINGKONG_7 */
      val KINGKONG_7 = "spec:width=1080,height=2300,unit=px,dpi=480"

      /** CUBOT KINGKONG_8 */
      val KINGKONG_8 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** CUBOT KINGKONG_9 */
      val KINGKONG_9 = "spec:width=1080,height=2408,unit=px,dpi=400"

      /** CUBOT KINGKONG_ACE_2 */
      val KINGKONG_ACE_2 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** CUBOT KINGKONG_ACE_3 */
      val KINGKONG_ACE_3 = "spec:width=1080,height=2408,unit=px,dpi=400"

      /** CUBOT KINGKONG_ES */
      val KINGKONG_ES = "spec:width=720,height=1612,unit=px,dpi=272"

      /** CUBOT KINGKONG_MINI */
      val KINGKONG_MINI = "spec:width=540,height=1080,unit=px,dpi=240"

      /** CUBOT KINGKONG_MINI2 */
      val KINGKONG_MINI2 = "spec:width=540,height=1080,unit=px,dpi=240"

      /** CUBOT KINGKONG_MINI2_Pro */
      val KINGKONG_MINI2_PRO = "spec:width=540,height=1080,unit=px,dpi=240"

      /** CUBOT KINGKONG_POWER_3 */
      val KINGKONG_POWER_3 = "spec:width=1080,height=2400,unit=px,dpi=390"

      /** CUBOT KINGKONG_POWER_5 */
      val KINGKONG_POWER_5 = "spec:width=720,height=1640,unit=px,dpi=260"

      /** CUBOT KINGKONG_STAR */
      val KINGKONG_STAR = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** CUBOT KINGKONG_STAR_2 */
      val KINGKONG_STAR_2 = "spec:width=1080,height=2400,unit=px,dpi=400"

      /** CUBOT KINGKONG_X */
      val KINGKONG_X = "spec:width=1080,height=2408,unit=px,dpi=400"

      /** CUBOT KING_KONG_3 */
      val KING_KONG_3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** CUBOT KING_KONG_CS */
      val KING_KONG_CS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** CUBOT MAX_2 */
      val MAX_2 = "spec:width=640,height=1352,unit=px,dpi=240"

      /** CUBOT MAX_3 */
      val MAX_3 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** CUBOT MAX_5 */
      val MAX_5 = "spec:width=1080,height=2460,unit=px,dpi=400"

      /** CUBOT NOTE_20 */
      val NOTE_20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** CUBOT NOTE_20_PRO */
      val NOTE_20_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** CUBOT NOTE_30 */
      val NOTE_30 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** CUBOT NOTE_40 */
      val NOTE_40 = "spec:width=720,height=1612,unit=px,dpi=260"

      /** CUBOT NOTE_50 */
      val NOTE_50 = "spec:width=720,height=1612,unit=px,dpi=260"

      /** CUBOT NOTE_7 */
      val NOTE_7 = "spec:width=442,height=960,unit=px,dpi=240"

      /** CUBOT NOTE_8 */
      val NOTE_8 = "spec:width=442,height=960,unit=px,dpi=240"

      /** CUBOT NOTE_9 */
      val NOTE_9 = "spec:width=480,height=960,unit=px,dpi=240"

      /** CUBOT P30 */
      val P30 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** CUBOT P40 */
      val P40 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** CUBOT P50 */
      val P50 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** CUBOT P60 */
      val P60 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** CUBOT P80 */
      val P80 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** CUBOT Pocket */
      val POCKET = "spec:width=540,height=1080,unit=px,dpi=240"

      /** CUBOT POCKET_3 */
      val POCKET_3 = "spec:width=480,height=1170,unit=px,dpi=204"

      /** CUBOT QUEST */
      val QUEST = "spec:width=720,height=1440,unit=px,dpi=320"

      /** CUBOT QUEST_LITE */
      val QUEST_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** CUBOT R15 */
      val R15 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** CUBOT R15_PRO */
      val R15_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** CUBOT R19 */
      val R19 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** CUBOT RAINBOW */
      val RAINBOW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** CUBOT RAINBOW_2 */
      val RAINBOW_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** CUBOT TAB_10 */
      val TAB_10 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** CUBOT TAB_20 */
      val TAB_20 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** CUBOT TAB_40 */
      val TAB_40 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** CUBOT TAB_50 */
      val TAB_50 = "spec:width=1200,height=2000,unit=px,dpi=220"

      /** CUBOT TAB_60 */
      val TAB_60 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** CUBOT TAB_70 */
      val TAB_70 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** CUBOT TAB_KINGKONG */
      val TAB_KINGKONG = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** CUBOT TAB_KINGKONG_2 */
      val TAB_KINGKONG_2 = "spec:width=1200,height=1920,unit=px,dpi=200"

      /** CUBOT X19 */
      val X19 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** CUBOT X19_S */
      val X19_S = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** CUBOT X20 */
      val X20 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** CUBOT X20_PRO */
      val X20_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** CUBOT X30 */
      val X30 = "spec:width=1080,height=2310,unit=px,dpi=480"

      /** CUBOT X30P */
      val X30P = "spec:width=1080,height=2310,unit=px,dpi=400"

      /** CUBOT X50 */
      val X50 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** CUBOT x5623_h6013_cubot */
      val X5623_H6013_CUBOT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** CUBOT x6069_cubot_5365u */
      val X6069_CUBOT_5365U = "spec:width=720,height=1280,unit=px,dpi=320"

      /** CUBOT X70 */
      val X70 = "spec:width=1080,height=2408,unit=px,dpi=400"

      /** CUBOT X90 */
      val X90 = "spec:width=1080,height=2400,unit=px,dpi=400"

  }
