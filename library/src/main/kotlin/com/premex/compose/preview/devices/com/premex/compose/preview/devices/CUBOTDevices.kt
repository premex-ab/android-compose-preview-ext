package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CUBOT device specifications for Android Compose previews.
 *
 * This extension provides CUBOT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CUBOT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CUBOT: Any
  get() = object {
      /** DeviceSpec(manufacturer=CUBOT, code=A1, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=A1, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val A1 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=A10, width=720, height=1612, dpi=272,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=A10, width=720,
      height=1612, dpi=272, isGoogleDevice=false).code */
      val A10 = "spec:width=720,height=1612,unit=px,dpi=272"

      /** DeviceSpec(manufacturer=CUBOT, code=A20, width=720, height=1600, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=A20, width=720,
      height=1600, dpi=260, isGoogleDevice=false).code */
      val A20 = "spec:width=720,height=1600,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=CUBOT, code=A30, width=720, height=1600, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=A30, width=720,
      height=1600, dpi=260, isGoogleDevice=false).code */
      val A30 = "spec:width=720,height=1600,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=CUBOT, code=C20, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=C20, width=1080,
      height=2246, dpi=480, isGoogleDevice=false).code */
      val C20 = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CUBOT, code=C30, width=1080, height=2310, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=C30, width=1080,
      height=2310, dpi=480, isGoogleDevice=false).code */
      val C30 = "spec:width=1080,height=2310,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CUBOT, code=CUBOT_A5, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=CUBOT_A5, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val CUBOT_A5 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CUBOT, code=CUBOT_CHEETAH_2, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=CUBOT_CHEETAH_2,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val CUBOT_CHEETAH_2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CUBOT, code=CUBOT_ECHO, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=CUBOT_ECHO, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CUBOT_ECHO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=CUBOT_H3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=CUBOT_H3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CUBOT_H3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=CUBOT_J3, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=CUBOT_J3, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val CUBOT_J3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CUBOT, code=CUBOT_J3_PRO, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=CUBOT_J3_PRO,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val CUBOT_J3_PRO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CUBOT, code=CUBOT_J9, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=CUBOT_J9, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val CUBOT_J9 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=CUBOT_MAGIC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=CUBOT_MAGIC, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CUBOT_MAGIC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=CUBOT_MANITO, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=CUBOT_MANITO,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val CUBOT_MANITO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=CUBOT_NOTE_Plus, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=CUBOT_NOTE_Plus,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val CUBOT_NOTE_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CUBOT, code=CUBOT_NOTE_S, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=CUBOT_NOTE_S,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val CUBOT_NOTE_S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=CUBOT_NOVA, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=CUBOT_NOVA, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val CUBOT_NOVA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=CUBOT_POWER, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=CUBOT_POWER,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val CUBOT_POWER = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CUBOT, code=CUBOT_R11, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=CUBOT_R11, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val CUBOT_R11 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=CUBOT_R9, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=CUBOT_R9, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CUBOT_R9 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=CUBOT_X18, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=CUBOT_X18, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val CUBOT_X18 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=J10, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=J10, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val J10 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CUBOT, code=J20, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=J20, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val J20 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=CUBOT, code=J5, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=J5, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val J5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CUBOT, code=J7, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=J7, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val J7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=J8, width=442, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=J8, width=442,
      height=960, dpi=240, isGoogleDevice=false).code */
      val J8 = "spec:width=442,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CUBOT, code=KINGKONGMINI3, width=480, height=1170, dpi=204,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=KINGKONGMINI3,
      width=480, height=1170, dpi=204, isGoogleDevice=false).code */
      val KINGKONGMINI3 = "spec:width=480,height=1170,unit=px,dpi=204"

      /** DeviceSpec(manufacturer=CUBOT, code=KINGKONG_5, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=KINGKONG_5, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val KINGKONG_5 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=KINGKONG_5_Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=KINGKONG_5_Pro,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val KINGKONG_5_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=KINGKONG_6, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=KINGKONG_6, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val KINGKONG_6 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=KINGKONG_7, width=1080, height=2300, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=KINGKONG_7, width=1080,
      height=2300, dpi=480, isGoogleDevice=false).code */
      val KINGKONG_7 = "spec:width=1080,height=2300,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CUBOT, code=KINGKONG_8, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=KINGKONG_8, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val KINGKONG_8 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=CUBOT, code=KINGKONG_9, width=1080, height=2408, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=KINGKONG_9, width=1080,
      height=2408, dpi=400, isGoogleDevice=false).code */
      val KINGKONG_9 = "spec:width=1080,height=2408,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=CUBOT, code=KINGKONG_ACE_2, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=KINGKONG_ACE_2,
      width=720, height=1612, dpi=280, isGoogleDevice=false).code */
      val KINGKONG_ACE_2 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=CUBOT, code=KINGKONG_ACE_3, width=1080, height=2408, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=KINGKONG_ACE_3,
      width=1080, height=2408, dpi=400, isGoogleDevice=false).code */
      val KINGKONG_ACE_3 = "spec:width=1080,height=2408,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=CUBOT, code=KINGKONG_ES, width=720, height=1612, dpi=272,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=KINGKONG_ES, width=720,
      height=1612, dpi=272, isGoogleDevice=false).code */
      val KINGKONG_ES = "spec:width=720,height=1612,unit=px,dpi=272"

      /** DeviceSpec(manufacturer=CUBOT, code=KINGKONG_MINI, width=540, height=1080, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=KINGKONG_MINI,
      width=540, height=1080, dpi=240, isGoogleDevice=false).code */
      val KINGKONG_MINI = "spec:width=540,height=1080,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CUBOT, code=KINGKONG_MINI2, width=540, height=1080, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=KINGKONG_MINI2,
      width=540, height=1080, dpi=240, isGoogleDevice=false).code */
      val KINGKONG_MINI2 = "spec:width=540,height=1080,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CUBOT, code=KINGKONG_MINI2_Pro, width=540, height=1080, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=KINGKONG_MINI2_Pro,
      width=540, height=1080, dpi=240, isGoogleDevice=false).code */
      val KINGKONG_MINI2_PRO = "spec:width=540,height=1080,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CUBOT, code=KINGKONG_POWER_3, width=1080, height=2400, dpi=390,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=KINGKONG_POWER_3,
      width=1080, height=2400, dpi=390, isGoogleDevice=false).code */
      val KINGKONG_POWER_3 = "spec:width=1080,height=2400,unit=px,dpi=390"

      /** DeviceSpec(manufacturer=CUBOT, code=KINGKONG_POWER_5, width=720, height=1640, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=KINGKONG_POWER_5,
      width=720, height=1640, dpi=260, isGoogleDevice=false).code */
      val KINGKONG_POWER_5 = "spec:width=720,height=1640,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=CUBOT, code=KINGKONG_STAR, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=KINGKONG_STAR,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val KINGKONG_STAR = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CUBOT, code=KINGKONG_STAR_2, width=1080, height=2400, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=KINGKONG_STAR_2,
      width=1080, height=2400, dpi=400, isGoogleDevice=false).code */
      val KINGKONG_STAR_2 = "spec:width=1080,height=2400,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=CUBOT, code=KINGKONG_X, width=1080, height=2408, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=KINGKONG_X, width=1080,
      height=2408, dpi=400, isGoogleDevice=false).code */
      val KINGKONG_X = "spec:width=1080,height=2408,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=CUBOT, code=KING_KONG_3, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=KING_KONG_3, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val KING_KONG_3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=KING_KONG_CS, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=KING_KONG_CS,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val KING_KONG_CS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=MAX_2, width=640, height=1352, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=MAX_2, width=640,
      height=1352, dpi=240, isGoogleDevice=false).code */
      val MAX_2 = "spec:width=640,height=1352,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CUBOT, code=MAX_3, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=MAX_3, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val MAX_3 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=MAX_5, width=1080, height=2460, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=MAX_5, width=1080,
      height=2460, dpi=400, isGoogleDevice=false).code */
      val MAX_5 = "spec:width=1080,height=2460,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=CUBOT, code=NOTE_20, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=NOTE_20, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NOTE_20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=NOTE_20_PRO, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=NOTE_20_PRO, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NOTE_20_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=NOTE_30, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=NOTE_30, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NOTE_30 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=NOTE_40, width=720, height=1612, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=NOTE_40, width=720,
      height=1612, dpi=260, isGoogleDevice=false).code */
      val NOTE_40 = "spec:width=720,height=1612,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=CUBOT, code=NOTE_50, width=720, height=1612, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=NOTE_50, width=720,
      height=1612, dpi=260, isGoogleDevice=false).code */
      val NOTE_50 = "spec:width=720,height=1612,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=CUBOT, code=NOTE_7, width=442, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=NOTE_7, width=442,
      height=960, dpi=240, isGoogleDevice=false).code */
      val NOTE_7 = "spec:width=442,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CUBOT, code=NOTE_8, width=442, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=NOTE_8, width=442,
      height=960, dpi=240, isGoogleDevice=false).code */
      val NOTE_8 = "spec:width=442,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CUBOT, code=NOTE_9, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=NOTE_9, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val NOTE_9 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CUBOT, code=P30, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=P30, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val P30 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CUBOT, code=P40, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=P40, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val P40 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=P50, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=P50, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val P50 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=P60, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=P60, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P60 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=P80, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=P80, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val P80 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CUBOT, code=Pocket, width=540, height=1080, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=Pocket, width=540,
      height=1080, dpi=240, isGoogleDevice=false).code */
      val POCKET = "spec:width=540,height=1080,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CUBOT, code=POCKET_3, width=480, height=1170, dpi=204,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=POCKET_3, width=480,
      height=1170, dpi=204, isGoogleDevice=false).code */
      val POCKET_3 = "spec:width=480,height=1170,unit=px,dpi=204"

      /** DeviceSpec(manufacturer=CUBOT, code=QUEST, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=QUEST, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val QUEST = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=QUEST_LITE, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=QUEST_LITE, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val QUEST_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=R15, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=R15, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val R15 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=R15_PRO, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=R15_PRO, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val R15_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=R19, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=R19, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val R19 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=RAINBOW, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=RAINBOW, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val RAINBOW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=RAINBOW_2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=RAINBOW_2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val RAINBOW_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=TAB_10, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=TAB_10, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TAB_10 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=TAB_20, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=TAB_20, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_20 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CUBOT, code=TAB_40, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=TAB_40, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val TAB_40 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CUBOT, code=TAB_50, width=1200, height=2000, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=TAB_50, width=1200,
      height=2000, dpi=220, isGoogleDevice=false).code */
      val TAB_50 = "spec:width=1200,height=2000,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=CUBOT, code=TAB_60, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=TAB_60, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_60 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CUBOT, code=TAB_70, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=TAB_70, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val TAB_70 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=CUBOT, code=TAB_KINGKONG, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=TAB_KINGKONG,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val TAB_KINGKONG = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=CUBOT, code=TAB_KINGKONG_2, width=1200, height=1920, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=TAB_KINGKONG_2,
      width=1200, height=1920, dpi=200, isGoogleDevice=false).code */
      val TAB_KINGKONG_2 = "spec:width=1200,height=1920,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=CUBOT, code=X19, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=X19, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val X19 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CUBOT, code=X19_S, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=X19_S, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val X19_S = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CUBOT, code=X20, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=X20, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val X20 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CUBOT, code=X20_PRO, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=X20_PRO, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val X20_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CUBOT, code=X30, width=1080, height=2310, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=X30, width=1080,
      height=2310, dpi=480, isGoogleDevice=false).code */
      val X30 = "spec:width=1080,height=2310,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CUBOT, code=X30P, width=1080, height=2310, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=X30P, width=1080,
      height=2310, dpi=400, isGoogleDevice=false).code */
      val X30P = "spec:width=1080,height=2310,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=CUBOT, code=X50, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=X50, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val X50 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CUBOT, code=x5623_h6013_cubot, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=x5623_h6013_cubot,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val X5623_H6013_CUBOT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=x6069_cubot_5365u, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=x6069_cubot_5365u,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val X6069_CUBOT_5365U = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CUBOT, code=X70, width=1080, height=2408, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=X70, width=1080,
      height=2408, dpi=400, isGoogleDevice=false).code */
      val X70 = "spec:width=1080,height=2408,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=CUBOT, code=X90, width=1080, height=2400, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CUBOT, code=X90, width=1080,
      height=2400, dpi=400, isGoogleDevice=false).code */
      val X90 = "spec:width=1080,height=2400,unit=px,dpi=400"

  }
