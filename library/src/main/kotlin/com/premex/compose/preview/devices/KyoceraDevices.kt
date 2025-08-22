package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kyocera device specifications for Android Compose previews.
 *
 * This extension provides Kyocera device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kyocera.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kyocera get() = object {
    /** Kyocera おてがるスマホ01 */
    val _01 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Kyocera かんたんスマホ2+ */
    val _2 = "spec:width=720,height=1480,unit=px,dpi=320"

    /** Kyocera かんたんスマホ3 */
    val _3 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Kyocera 404KC */
    val _404KC = "spec:width=540,height=960,unit=px,dpi=240"

    /** Kyocera 503KC */
    val _503KC = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kyocera 602KC */
    val _602KC = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kyocera 704KC */
    val _704KC = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Kyocera 705KC */
    val _705KC = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kyocera Android One S10 */
    val ANDROID_ONE_S10 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Kyocera Android One S2 */
    val ANDROID_ONE_S2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kyocera Android One S9 */
    val ANDROID_ONE_S9 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Kyocera BASIO */
    val BASIO = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Kyocera BASIO 3 */
    val BASIO_3 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Kyocera BASIO4 */
    val BASIO4 = "spec:width=720,height=1480,unit=px,dpi=320"

    /** Kyocera BASIO active3 */
    val BASIO_ACTIVE3 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Kyocera Brigadier */
    val BRIGADIER = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kyocera DIGNO */
    val DIGNO = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Kyocera DIGNO BX */
    val DIGNO_BX = "spec:width=720,height=1440,unit=px,dpi=280"

    /** Kyocera DIGNO BX2 */
    val DIGNO_BX2 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Kyocera DIGNO BX3 カメラレス */
    val DIGNO_BX3 = "spec:width=720,height=1560,unit=px,dpi=300"

    /** Kyocera DIGNO L */
    val DIGNO_L = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kyocera DIGNO SANGA edition */
    val DIGNO_SANGA_EDITION = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Kyocera DIGNO SX3 */
    val DIGNO_SX3 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Kyocera DIGNO SX4 */
    val DIGNO_SX4 = "spec:width=720,height=1560,unit=px,dpi=300"

    /** Kyocera DIGNO SX4 Wi-Fi */
    val DIGNO_SX4_WI_FI = "spec:width=720,height=1560,unit=px,dpi=300"

    /** Kyocera DIGNO T */
    val DIGNO_T = "spec:width=540,height=960,unit=px,dpi=240"

    /** Kyocera DIGNO Tab */
    val DIGNO_TAB = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Kyocera DIGNO Tab2 5G */
    val DIGNO_TAB2_5G = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Kyocera DIGNO WX */
    val DIGNO_WX = "spec:width=1080,height=2280,unit=px,dpi=400"

    /** Kyocera DuraForce */
    val DURAFORCE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kyocera DuraForce EX */
    val DURAFORCE_EX = "spec:width=720,height=1560,unit=px,dpi=300"

    /** Kyocera DURA FORCE PRO */
    val DURA_FORCE_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Kyocera DuraForce PRO */
    val DURAFORCE_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Kyocera DuraForce Pro 2 */
    val DURAFORCE_PRO_2 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Kyocera DuraForce PRO 2 with Sapphire shield */
    val DURAFORCE_PRO_2_WITH_SAPPHIRE_SHIELD = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Kyocera DuraForce PRO 3 */
    val DURAFORCE_PRO_3 = "spec:width=1080,height=2160,unit=px,dpi=420"

    /** Kyocera DuraForce PRO with Sapphire Shield */
    val DURAFORCE_PRO_WITH_SAPPHIRE_SHIELD = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Kyocera DuraForce Ultra 5G */
    val DURAFORCE_ULTRA_5G = "spec:width=1080,height=2160,unit=px,dpi=420"

    /** Kyocera DuraForce XD */
    val DURAFORCE_XD = "spec:width=720,height=1280,unit=px,dpi=240"

    /** Kyocera DuraSport 5G */
    val DURASPORT_5G = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Kyocera  GRATINA */
    val GRATINA = "spec:width=1080,height=2280,unit=px,dpi=420"

    /** Kyocera Hydro AIR */
    val HYDRO_AIR = "spec:width=540,height=960,unit=px,dpi=240"

    /** Kyocera Hydro ICON */
    val HYDRO_ICON = "spec:width=540,height=960,unit=px,dpi=240"

    /** Kyocera Hydro LIFE */
    val HYDRO_LIFE = "spec:width=540,height=960,unit=px,dpi=240"

    /** Kyocera Hydro REACH */
    val HYDRO_REACH = "spec:width=540,height=960,unit=px,dpi=240"

    /** Kyocera Hydro SHORE */
    val HYDRO_SHORE = "spec:width=540,height=960,unit=px,dpi=240"

    /** Kyocera Hydro VIBE */
    val HYDRO_VIBE = "spec:width=540,height=960,unit=px,dpi=240"

    /** Kyocera Hydro VIEW */
    val HYDRO_VIEW = "spec:width=540,height=960,unit=px,dpi=240"

    /** Kyocera Hydro WAVE */
    val HYDRO_WAVE = "spec:width=540,height=960,unit=px,dpi=240"

    /** Kyocera INFOBAR A03 */
    val INFOBAR_A03 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Kyocera KC-01 */
    val KC_01 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Kyocera KC-T302DT */
    val KC_T302DT = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Kyocera KC-T303DT */
    val KC_T303DT = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Kyocera KC-T304 */
    val KC_T304 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Kyocera KC-T305 */
    val KC_T305 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Kyocera LUCE */
    val LUCE = "spec:width=540,height=960,unit=px,dpi=240"

    /** Kyocera miraie f */
    val MIRAIE_F = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kyocera Qua phone */
    val QUA_PHONE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kyocera Qua phone (KYV37) */
    val QUA_PHONE_KYV37 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kyocera Qua phone QZ */
    val QUA_PHONE_QZ = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Kyocera Qua tab 01 */
    val QUA_TAB_01 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Kyocera Qua tab QZ10 */
    val QUA_TAB_QZ10 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Kyocera Qua tab QZ8 */
    val QUA_TAB_QZ8 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Kyocera rafre */
    val RAFRE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kyocera S301 */
    val S301 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Kyocera S4 */
    val S4 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Kyocera S6 */
    val S6 = "spec:width=1080,height=2280,unit=px,dpi=420"

    /** Kyocera S8 */
    val S8 = "spec:width=1080,height=2280,unit=px,dpi=400"

    /** Kyocera SZJ201 */
    val SZJ201 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Kyocera TORQUE */
    val TORQUE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Kyocera TORQUE */
    val TORQUE_480X800 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Kyocera TORQUE G01 */
    val TORQUE_G01 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kyocera TORQUE G02 */
    val TORQUE_G02 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kyocera TORQUE G03 */
    val TORQUE_G03 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kyocera TORQUE G04 */
    val TORQUE_G04 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Kyocera TORQUE G06 */
    val TORQUE_G06 = "spec:width=1080,height=2160,unit=px,dpi=420"

    /** Kyocera TORQUE(KC-S701) */
    val TORQUE_KC_S701 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kyocera TORQUE(R) 5G */
    val TORQUE_R_5G = "spec:width=1080,height=2160,unit=px,dpi=420"

    /** Kyocera URBANO L01 */
    val URBANO_L01 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kyocera URBANO L02 */
    val URBANO_L02 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kyocera URBANO L03 */
    val URBANO_L03 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Kyocera URBANO V01 */
    val URBANO_V01 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Kyocera URBANO V02 */
    val URBANO_V02 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kyocera URBANO V03 */
    val URBANO_V03 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kyocera URBANO V04 */
    val URBANO_V04 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Kyocera WX10K */
    val WX10K = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kyocera X3 */
    val X3 = "spec:width=1080,height=1920,unit=px,dpi=480"

}
