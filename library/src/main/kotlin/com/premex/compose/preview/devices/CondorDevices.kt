package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Condor device specifications for Android Compose previews.
 *
 * This extension provides Condor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Condor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Condor get() = object {
    /** Condor Allure A55 Plus */
    val ALLURE_A55_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Condor Allure_A8_Pro */
    val ALLURE_A8_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Condor Allure M1 */
    val ALLURE_M1 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Condor Allure M1 Plus */
    val ALLURE_M1_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Condor Allure M2 */
    val ALLURE_M2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Condor Allure M3 */
    val ALLURE_M3 = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Condor Allure M3 lite */
    val ALLURE_M3_LITE = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Condor Allure X */
    val ALLURE_X = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Condor Customer need debug */
    val CUSTOMER_NEED_DEBUG = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Condor G6 Pro */
    val G6_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Condor Griffe G5 */
    val GRIFFE_G5 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Condor Griffe G5 Plus */
    val GRIFFE_G5_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Condor Griffe T1 */
    val GRIFFE_T1 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Condor Griffe T3 */
    val GRIFFE_T3 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Condor Griffe T4 */
    val GRIFFE_T4 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Condor Griffe_T5 */
    val GRIFFE_T5 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Condor Griffe T6 */
    val GRIFFE_T6 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Condor Griffe_T7 */
    val GRIFFE_T7 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Condor Griffe T8 */
    val GRIFFE_T8 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Condor Griffe T8 Plus */
    val GRIFFE_T8_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Condor Griffe T9 */
    val GRIFFE_T9 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Condor Griffe T9 Plus */
    val GRIFFE_T9_PLUS = "spec:width=540,height=1132,unit=px,dpi=240"

    /** Condor GT60 PRO */
    val GT60_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Condor Infinity_a4 */
    val INFINITY_A4 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Condor Infinity_E4 */
    val INFINITY_E4 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Condor Infinity E5 */
    val INFINITY_E5 = "spec:width=540,height=1132,unit=px,dpi=240"

    /** Condor Infinity E5 Pro */
    val INFINITY_E5_PRO = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Condor NOVA60 */
    val NOVA60 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Condor PGN409 */
    val PGN409 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Condor PGN511 */
    val PGN511 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Condor PGN513 */
    val PGN513 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Condor PGN514 */
    val PGN514 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Condor PGN515 */
    val PGN515 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Condor PGN516 */
    val PGN516 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Condor PGN517 */
    val PGN517 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Condor PGN518 */
    val PGN518 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Condor PGN521 */
    val PGN521 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Condor PGN522 */
    val PGN522 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Condor PGN523 */
    val PGN523 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Condor PGN605 */
    val PGN605 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Condor PGN606 */
    val PGN606 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Condor PGN607 */
    val PGN607 = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** Condor PGN608 */
    val PGN608 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Condor PGN609 */
    val PGN609 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Condor PGN611 */
    val PGN611 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Condor Plume A8 Plus */
    val PLUME_A8_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Condor Plume H1 */
    val PLUME_H1 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Condor Plume L1 */
    val PLUME_L1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Condor Plume L1 Plus */
    val PLUME_L1_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Condor Plume L2 */
    val PLUME_L2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Condor Plume_L2_Pro */
    val PLUME_L2_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Condor Plume L3 */
    val PLUME_L3 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Condor Plume_L3_Plus */
    val PLUME_L3_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Condor Plume L4 */
    val PLUME_L4 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Condor Plume_L4_Pro_EEA */
    val PLUME_L4_PRO_EEA = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Condor Plume L5 */
    val PLUME_L5 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Condor Plume_L5_Pro */
    val PLUME_L5_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Condor Plume L6 Pro */
    val PLUME_L6_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Condor Plume L8 Pro */
    val PLUME_L8_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Condor Plume P4 Plus */
    val PLUME_P4_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Condor Plume P6 Pro LTE */
    val PLUME_P6_PRO_LTE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Condor Plume P8 Lite */
    val PLUME_P8_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Condor Plume P8 Pro */
    val PLUME_P8_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Condor SP530 */
    val SP530 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Condor SP638 */
    val SP638 = "spec:width=720,height=1500,unit=px,dpi=320"

    /** Condor SP659 */
    val SP659 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Condor SP661 */
    val SP661 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Condor SP662 */
    val SP662 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Condor SP663 */
    val SP663 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Condor SP664_2 */
    val SP664_2 = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Condor SP665 */
    val SP665 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Condor SP666 */
    val SP666 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Condor TB105L */
    val TB105L = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Condor TB109L */
    val TB109L = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Condor TB716 */
    val TB716 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Condor TB717G_8_1 */
    val TB717G_8_1 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Condor TB717L */
    val TB717L = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Condor TB718 */
    val TB718 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Condor TB802L */
    val TB802L = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Condor TFX711G */
    val TFX711G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Condor TFX712G */
    val TFX712G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Condor TFX713L */
    val TFX713L = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Condor TFX714L */
    val TFX714L = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Condor TGW102L */
    val TGW102L = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Condor TGW801G */
    val TGW801G = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Condor TGW801L */
    val TGW801L = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Condor TMK715L */
    val TMK715L = "spec:width=600,height=1024,unit=px,dpi=160"

}
