package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cubot device specifications for Android Compose previews.
 *
 * This extension provides Cubot device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cubot.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cubot get() = object {
    /** Cubot A10 */
    val A10 = "spec:width=720,height=1612,unit=px,dpi=272"

    /** Cubot A1_EEA */
    val A1_EEA = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Cubot A20 */
    val A20 = "spec:width=720,height=1600,unit=px,dpi=260"

    /** Cubot A30 */
    val A30 = "spec:width=720,height=1600,unit=px,dpi=260"

    /** Cubot C20 */
    val C20 = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Cubot C30 */
    val C30 = "spec:width=1080,height=2310,unit=px,dpi=480"

    /** Cubot CUBOT_A5 */
    val CUBOT_A5 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Cubot CUBOT CHEETAH 2 */
    val CUBOT_CHEETAH_2 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Cubot CUBOT H3 */
    val CUBOT_H3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Cubot CUBOT_J3 */
    val CUBOT_J3 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Cubot CUBOT_J3_PRO */
    val CUBOT_J3_PRO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Cubot CUBOT J9 */
    val CUBOT_J9 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Cubot CUBOT MAGIC */
    val CUBOT_MAGIC = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Cubot CUBOT NOTE Plus */
    val CUBOT_NOTE_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Cubot CUBOT_NOVA */
    val CUBOT_NOVA = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Cubot CUBOT_POWER */
    val CUBOT_POWER = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Cubot CUBOT R11 */
    val CUBOT_R11 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Cubot CUBOT X18 */
    val CUBOT_X18 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Cubot DINOSAUR */
    val DINOSAUR = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Cubot ECHO */
    val ECHO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Cubot J10 */
    val J10 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Cubot J20 */
    val J20 = "spec:width=480,height=854,unit=px,dpi=200"

    /** Cubot J5 */
    val J5 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Cubot J7 */
    val J7 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Cubot J8 */
    val J8 = "spec:width=442,height=960,unit=px,dpi=240"

    /** Cubot KING_KONG_3 */
    val KING_KONG_3 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Cubot KINGKONG 5 */
    val KINGKONG_5 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Cubot KINGKONG 5 Pro */
    val KINGKONG_5_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Cubot KINGKONG 6 */
    val KINGKONG_6 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Cubot KINGKONG 7 */
    val KINGKONG_7 = "spec:width=1080,height=2300,unit=px,dpi=480"

    /** Cubot KINGKONG 8 */
    val KINGKONG_8 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Cubot KINGKONG 9 */
    val KINGKONG_9 = "spec:width=1080,height=2408,unit=px,dpi=400"

    /** Cubot KINGKONG ACE 2 */
    val KINGKONG_ACE_2 = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Cubot KINGKONG ACE 3 */
    val KINGKONG_ACE_3 = "spec:width=1080,height=2408,unit=px,dpi=400"

    /** Cubot KINGKONG CS */
    val KINGKONG_CS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Cubot KINGKONG ES */
    val KINGKONG_ES = "spec:width=720,height=1612,unit=px,dpi=272"

    /** Cubot KINGKONG_MINI */
    val KINGKONG_MINI = "spec:width=540,height=1080,unit=px,dpi=240"

    /** Cubot KINGKONG MINI2 */
    val KINGKONG_MINI2 = "spec:width=540,height=1080,unit=px,dpi=240"

    /** Cubot KINGKONG MINI2 Pro */
    val KINGKONG_MINI2_PRO = "spec:width=540,height=1080,unit=px,dpi=240"

    /** Cubot KINGKONG MINI 3 */
    val KINGKONG_MINI_3 = "spec:width=480,height=1170,unit=px,dpi=204"

    /** Cubot KINGKONG POWER 3 */
    val KINGKONG_POWER_3 = "spec:width=1080,height=2400,unit=px,dpi=390"

    /** Cubot KINGKONG_POWER_5 */
    val KINGKONG_POWER_5 = "spec:width=720,height=1640,unit=px,dpi=260"

    /** Cubot KINGKONG STAR */
    val KINGKONG_STAR = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Cubot KINGKONG STAR 2 */
    val KINGKONG_STAR_2 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Cubot KINGKONG X */
    val KINGKONG_X = "spec:width=1080,height=2408,unit=px,dpi=400"

    /** Cubot MANITO */
    val MANITO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Cubot MAX */
    val MAX = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Cubot MAX  2 */
    val MAX_2 = "spec:width=640,height=1352,unit=px,dpi=240"

    /** Cubot MAX 3 */
    val MAX_3 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Cubot MAX 5 */
    val MAX_5 = "spec:width=1080,height=2460,unit=px,dpi=400"

    /** Cubot NOTE 20 */
    val NOTE_20 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Cubot NOTE 20 PRO */
    val NOTE_20_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Cubot NOTE 30 */
    val NOTE_30 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Cubot NOTE 40 */
    val NOTE_40 = "spec:width=720,height=1612,unit=px,dpi=260"

    /** Cubot NOTE 50 */
    val NOTE_50 = "spec:width=720,height=1612,unit=px,dpi=260"

    /** Cubot NOTE 7 */
    val NOTE_7 = "spec:width=442,height=960,unit=px,dpi=240"

    /** Cubot NOTE 8 */
    val NOTE_8 = "spec:width=442,height=960,unit=px,dpi=240"

    /** Cubot note_9 */
    val NOTE_9 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Cubot NOTE S */
    val NOTE_S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Cubot P30 */
    val P30 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Cubot P40 */
    val P40 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Cubot P50 */
    val P50 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Cubot P60 */
    val P60 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Cubot P80 */
    val P80 = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Cubot Pocket */
    val POCKET = "spec:width=540,height=1080,unit=px,dpi=240"

    /** Cubot POCKET 3 */
    val POCKET_3 = "spec:width=480,height=1170,unit=px,dpi=204"

    /** Cubot QUEST */
    val QUEST = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Cubot QUEST LITE */
    val QUEST_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Cubot R15 */
    val R15 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Cubot R15_PRO */
    val R15_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Cubot R19 */
    val R19 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Cubot Rainbow */
    val RAINBOW = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Cubot RAINBOW 2 */
    val RAINBOW_2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Cubot TAB 10 */
    val TAB_10 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Cubot TAB 20 */
    val TAB_20 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Cubot TAB 40 */
    val TAB_40 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Cubot TAB 50 */
    val TAB_50 = "spec:width=1200,height=2000,unit=px,dpi=220"

    /** Cubot TAB  60 */
    val TAB_60 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Cubot TAB_70 */
    val TAB_70 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Cubot TAB KINGKONG */
    val TAB_KINGKONG = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Cubot TAB KINGKONG 2 */
    val TAB_KINGKONG_2 = "spec:width=1200,height=1920,unit=px,dpi=200"

    /** Cubot X19 */
    val X19 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Cubot X19_S */
    val X19_S = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Cubot X20 */
    val X20 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Cubot X20_PRO */
    val X20_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Cubot X30 */
    val X30 = "spec:width=1080,height=2310,unit=px,dpi=480"

    /** Cubot X30P */
    val X30P = "spec:width=1080,height=2310,unit=px,dpi=400"

    /** Cubot X50 */
    val X50 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Cubot X70 */
    val X70 = "spec:width=1080,height=2408,unit=px,dpi=400"

    /** Cubot X90 */
    val X90 = "spec:width=1080,height=2400,unit=px,dpi=400"

}
