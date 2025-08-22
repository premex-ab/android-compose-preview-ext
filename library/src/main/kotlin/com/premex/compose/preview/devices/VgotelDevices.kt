package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vgotel device specifications for Android Compose previews.
 *
 * This extension provides Vgotel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vgotel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vgotel get() = object {
    /** Vgotel Flex_2 */
    val FLEX_2 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Vgotel NEW 10 */
    val NEW_10 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Vgotel NEW 11 */
    val NEW_11 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Vgotel NEW 15 */
    val NEW_15 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Vgotel NEW 15 Pro */
    val NEW_15_PRO = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Vgotel NEW_20 */
    val NEW_20 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Vgotel NEW 24 */
    val NEW_24 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Vgotel NEW 25 */
    val NEW_25 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Vgotel NEW 26 */
    val NEW_26 = "spec:width=720,height=1604,unit=px,dpi=320"

    /** Vgotel NEW 7 */
    val NEW_7 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Vgotel NOTE_23_V02 */
    val NOTE_23_V02 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Vgotel NOTE 24 */
    val NOTE_24 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Vgotel OCEAN 6 */
    val OCEAN_6 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Vgotel Ocean 9 */
    val OCEAN_9 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Vgotel Ocean9L */
    val OCEAN9L = "spec:width=480,height=854,unit=px,dpi=240"

    /** Vgotel Smart 2 */
    val SMART_2 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Vgotel Smart 4 */
    val SMART_4 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Vgotel Smart 5 */
    val SMART_5 = "spec:width=540,height=1132,unit=px,dpi=240"

    /** Vgotel Smart 7 */
    val SMART_7 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Vgotel SMART 8 */
    val SMART_8 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Vgotel VentureV10 */
    val VENTUREV10 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vgotel VENTURE V12 */
    val VENTURE_V12 = "spec:width=720,height=1280,unit=px,dpi=320"

}
