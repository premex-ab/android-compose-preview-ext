package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Acefrance device specifications for Android Compose previews.
 *
 * This extension provides Acefrance device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Acefrance.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Acefrance get() = object {
    /** Acefrance AS0218 */
    val AS0218 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Acefrance AS0518 */
    val AS0518 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Acefrance AS0618 */
    val AS0618 = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Acefrance BUZZ_1_Lite */
    val BUZZ_1_LITE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Acefrance BUZZ_1_Plus */
    val BUZZ_1_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Acefrance BUZZ 2 */
    val BUZZ_2 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Acefrance BUZZ_3E */
    val BUZZ_3E = "spec:width=480,height=960,unit=px,dpi=200"

    /** Acefrance BUZZ 3 Lite */
    val BUZZ_3_LITE = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Acefrance BUZZ 4Lite */
    val BUZZ_4LITE = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Acefrance BUZZ 4Pro */
    val BUZZ_4PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Acefrance BUZZ 4S */
    val BUZZ_4S = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Acefrance BUZZ 5 Pro */
    val BUZZ_5_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Acefrance BUZZ 5 Pro PLUS */
    val BUZZ_5_PRO_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Acefrance BUZZ 6 Pro */
    val BUZZ_6_PRO = "spec:width=720,height=1612,unit=px,dpi=480"

    /** Acefrance BUZZ 7 Note */
    val BUZZ_7_NOTE = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Acefrance BUZZ 7 Prime */
    val BUZZ_7_PRIME = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Acefrance BUZZ 7 Prime PLUS */
    val BUZZ_7_PRIME_PLUS = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Acefrance URBAN 1 */
    val URBAN_1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Acefrance URBAN 2 */
    val URBAN_2 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Acefrance URBAN 3  */
    val URBAN_3 = "spec:width=720,height=1600,unit=px,dpi=320"

}
