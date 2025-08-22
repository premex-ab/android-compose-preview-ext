package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Karbonn device specifications for Android Compose previews.
 *
 * This extension provides Karbonn device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Karbonn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Karbonn get() = object {
    /** Karbonn A1 Indian */
    val A1_INDIAN = "spec:width=480,height=800,unit=px,dpi=240"

    /** Karbonn A40 Indian */
    val A40_INDIAN = "spec:width=480,height=800,unit=px,dpi=240"

    /** Karbonn A40 Indian Plus */
    val A40_INDIAN_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

    /** Karbonn A41 Power */
    val A41_POWER = "spec:width=480,height=800,unit=px,dpi=240"

    /** Karbonn Aura Note 4G */
    val AURA_NOTE_4G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Karbonn Aura Power 4G */
    val AURA_POWER_4G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Karbonn K9 Smart 4G */
    val K9_SMART_4G = "spec:width=480,height=854,unit=px,dpi=240"

    /** Karbonn K9_Smart_Plus */
    val K9_SMART_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Karbonn K9 Smart Yuva */
    val K9_SMART_YUVA = "spec:width=480,height=854,unit=px,dpi=240"

    /** Karbonn K9_Viraat_Plus */
    val K9_VIRAAT_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

    /** Karbonn Karbonn X21 */
    val KARBONN_X21 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Karbonn Platinum P9 */
    val PLATINUM_P9 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Karbonn Platinum P9 Pro */
    val PLATINUM_P9_PRO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Karbonn Titanium Jumbo */
    val TITANIUM_JUMBO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Karbonn Titanium Jumbo 2 */
    val TITANIUM_JUMBO_2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Karbonn Titanium_S9Plus */
    val TITANIUM_S9PLUS = "spec:width=600,height=1280,unit=px,dpi=320"

}
