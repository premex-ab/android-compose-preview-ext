package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bqru device specifications for Android Compose previews.
 *
 * This extension provides Bqru device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bqru.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bqru get() = object {
    /** Bqru 5060 */
    val _5060 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru 5701L Slim */
    val _5701L_SLIM = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bqru BQ-1020L */
    val BQ_1020L = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Bqru BQ-1024L */
    val BQ_1024L = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Bqru BQ-1025L */
    val BQ_1025L = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Bqru BQ-1025L */
    val BQ_1025L_1200X1920 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Bqru BQ-1036L */
    val BQ_1036L = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Bqru BQ-1045G */
    val BQ_1045G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Bqru BQ-1056L */
    val BQ_1056L = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Bqru BQ-1081G */
    val BQ_1081G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Bqru BQ-1082G */
    val BQ_1082G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Bqru BQ-1084L */
    val BQ_1084L = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Bqru BQ-1085L */
    val BQ_1085L = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Bqru BQ-1085L */
    val BQ_1085L_800X1280 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Bqru BQ-4028UP! */
    val BQ_4028UP = "spec:width=480,height=800,unit=px,dpi=240"

    /** Bqru BQ-4030G Nice Mini */
    val BQ_4030G_NICE_MINI = "spec:width=480,height=800,unit=px,dpi=240"

    /** Bqru BQ-4072 Strike Mini */
    val BQ_4072_STRIKE_MINI = "spec:width=480,height=800,unit=px,dpi=240"

    /** Bqru BQ-4500L */
    val BQ_4500L = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bqru BQ-4501G */
    val BQ_4501G = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bqru BQ-5000G */
    val BQ_5000G = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bqru BQ-5002G */
    val BQ_5002G = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bqru BQ-5003L Shark Pro */
    val BQ_5003L_SHARK_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQ-5005L INTENSE */
    val BQ_5005L_INTENSE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQ-5007L IRON */
    val BQ_5007L_IRON = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQ-5009L */
    val BQ_5009L = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQ-5010G SPOT */
    val BQ_5010G_SPOT = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQ-5011G FOX VIEW */
    val BQ_5011G_FOX_VIEW = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bqru BQ-5012L */
    val BQ_5012L = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQ-5016G */
    val BQ_5016G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQ-5031G */
    val BQ_5031G = "spec:width=720,height=1280,unit=px,dpi=300"

    /** Bqru BQ-5033 Shark */
    val BQ_5033_SHARK = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQ-5035 Velvet */
    val BQ_5035_VELVET = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bqru BQ-5044 Strike LTE */
    val BQ_5044_STRIKE_LTE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQ-5045L */
    val BQ_5045L = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bqru BQ-5046L */
    val BQ_5046L = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQ-5047L */
    val BQ_5047L = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bqru BQ-5056 Fresh */
    val BQ_5056_FRESH = "spec:width=480,height=854,unit=px,dpi=213"

    /** Bqru BQ-5057 Strike 2 */
    val BQ_5057_STRIKE_2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQ-5058 Strike Power Easy */
    val BQ_5058_STRIKE_POWER_EASY = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bqru BQ-5059 Strike Power */
    val BQ_5059_STRIKE_POWER = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQ-5060L */
    val BQ_5060L = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bqru BQ-5201 */
    val BQ_5201 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQ-5202 */
    val BQ_5202 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQ-5203 Shark */
    val BQ_5203_SHARK = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQ-5204 Strike Selfie */
    val BQ_5204_STRIKE_SELFIE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQ-5206L Balance */
    val BQ_5206L_BALANCE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQ-5211 */
    val BQ_5211 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQ-5300G */
    val BQ_5300G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bqru BQ-5302G */
    val BQ_5302G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bqru BQ-5340 Choice */
    val BQ_5340_CHOICE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bqru BQ-5500L Advance */
    val BQ_5500L_ADVANCE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bqru BQ-5504 Strike Selfie Max */
    val BQ_5504_STRIKE_SELFIE_MAX = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQ-5508L */
    val BQ_5508L = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bqru BQ-5510 Strike Power Max 4G */
    val BQ_5510_STRIKE_POWER_MAX_4G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQ-5512L STRIKE FORWARD */
    val BQ_5512L_STRIKE_FORWARD = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bqru BQ-5517L TWIN PRO */
    val BQ_5517L_TWIN_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Bqru BQ-5518G */
    val BQ_5518G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bqru BQ-5519G */
    val BQ_5519G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bqru BQ-5519L Tele2 */
    val BQ_5519L_TELE2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bqru BQ-5520L Silk */
    val BQ_5520L_SILK = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bqru BQ-5522 Next */
    val BQ_5522_NEXT = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bqru BQ-5528L */
    val BQ_5528L = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bqru BQ-5530L */
    val BQ_5530L = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bqru BQ-5533G */
    val BQ_5533G = "spec:width=480,height=960,unit=px,dpi=200"

    /** Bqru BQ-5535L */
    val BQ_5535L = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bqru BQ-5540L */
    val BQ_5540L = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bqru BQ-5541L */
    val BQ_5541L = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bqru BQ-5560L */
    val BQ_5560L = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bqru BQ-5591 Jeans */
    val BQ_5591_JEANS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQ-5594 Strike Power Max */
    val BQ_5594_STRIKE_POWER_MAX = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQ-5700L Space X */
    val BQ_5700L_SPACE_X = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bqru BQ-5702 */
    val BQ_5702 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bqru BQ-5707G Next Music */
    val BQ_5707G_NEXT_MUSIC = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bqru BQ-5730L */
    val BQ_5730L = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Bqru BQ-5731L Magic S */
    val BQ_5731L_MAGIC_S = "spec:width=1080,height=2280,unit=px,dpi=480"

    /** Bqru BQ-5732L */
    val BQ_5732L = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Bqru BQ-5740G */
    val BQ_5740G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bqru BQ-5740G_7731 */
    val BQ_5740G_7731 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bqru BQ-5745L Clever */
    val BQ_5745L_CLEVER = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bqru BQ-5765L */
    val BQ_5765L = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bqru BQ-6000L Aurora */
    val BQ_6000L_AURORA = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bqru BQ-6001 L */
    val BQ_6001_L = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bqru BQ-6010G */
    val BQ_6010G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bqru BQ-6015L Universe */
    val BQ_6015L_UNIVERSE = "spec:width=720,height=1528,unit=px,dpi=280"

    /** Bqru BQ-6030G */
    val BQ_6030G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bqru BQ-6030G_7731 */
    val BQ_6030G_7731 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bqru BQ-6035L */
    val BQ_6035L = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Bqru BQ-6040L */
    val BQ_6040L = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Bqru BQ-6042 */
    val BQ_6042 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Bqru BQ-6045L Nice */
    val BQ_6045L_NICE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bqru BQ-6051G */
    val BQ_6051G = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Bqru BQ-6065L  */
    val BQ_6065L = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bqru BQ-6200L Aurora */
    val BQ_6200L_AURORA = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Bqru BQ 6353L */
    val BQ_6353L = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Bqru BQ-6424L */
    val BQ_6424L = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Bqru BQ-6630L */
    val BQ_6630L = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Bqru BQ-6645L Element */
    val BQ_6645L_ELEMENT = "spec:width=540,height=1200,unit=px,dpi=240"

    /** Bqru BQ-6761 */
    val BQ_6761 = "spec:width=720,height=1600,unit=px,dpi=480"

    /** Bqru BQ-6861L */
    val BQ_6861L = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Bqru BQ-6868L */
    val BQ_6868L = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Bqru BQ-7000G */
    val BQ_7000G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Bqru BQ-7000G */
    val BQ_7000G_600X1024 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Bqru BQ-7036L */
    val BQ_7036L = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Bqru BQ-7038G */
    val BQ_7038G = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Bqru BQ-7040G */
    val BQ_7040G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Bqru BQ-7040G */
    val BQ_7040G_600X1024 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Bqru BQ-7055L */
    val BQ_7055L = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Bqru BQ-7081G */
    val BQ_7081G = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Bqru BQ-7082G */
    val BQ_7082G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Bqru BQ-7082G */
    val BQ_7082G_600X1024 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Bqru BQ-7083G_Plus */
    val BQ_7083G_PLUS = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Bqru BQ-7098G */
    val BQ_7098G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Bqru BQ-7098G */
    val BQ_7098G_600X1024 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Bqru BQ-8068L */
    val BQ_8068L = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Bqru BQ-8077L */
    val BQ_8077L = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Bqru BQ-8088L */
    val BQ_8088L = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Bqru BQ-9055L */
    val BQ_9055L = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Bqru BQru-1022L */
    val BQRU_1022L = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Bqru BQru-1045G_A11 */
    val BQRU_1045G_A11 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Bqru BQru-1077L */
    val BQRU_1077L = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Bqru BQru-1077L_2019 */
    val BQRU_1077L_2019 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Bqru BQru-1081G */
    val BQRU_1081G = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Bqru BQru-1082G */
    val BQRU_1082G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Bqru BQru-1082G_2020 */
    val BQRU_1082G_2020 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Bqru BQru-1083G */
    val BQRU_1083G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Bqru BQru-1083G_2019 */
    val BQRU_1083G_2019 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Bqru BQru-1083G_2020 */
    val BQRU_1083G_2020 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Bqru BQru-5022 */
    val BQRU_5022 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru Bqru-5037 */
    val BQRU_5037 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQru-5514G */
    val BQRU_5514G = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bqru BQru-5514L */
    val BQRU_5514L = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bqru BQru-5521L */
    val BQRU_5521L = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQru-5565L */
    val BQRU_5565L = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bqru BQru_6022G */
    val BQRU_6022G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bqru BQru-6022GA */
    val BQRU_6022GA = "spec:width=480,height=960,unit=px,dpi=200"

    /** Bqru BQru-6061L */
    val BQRU_6061L = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Bqru BQru_6430L */
    val BQRU_6430L = "spec:width=1080,height=2310,unit=px,dpi=480"

    /** Bqru BQru-6631G */
    val BQRU_6631G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bqru BQru-6631G_A11 */
    val BQRU_6631G_A11 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Bqru BQru-7082 */
    val BQRU_7082 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Bqru BQru-7083 */
    val BQRU_7083 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Bqru BQru-8068L_A11 */
    val BQRU_8068L_A11 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Bqru FOX POWER */
    val FOX_POWER = "spec:width=480,height=854,unit=px,dpi=240"

}
