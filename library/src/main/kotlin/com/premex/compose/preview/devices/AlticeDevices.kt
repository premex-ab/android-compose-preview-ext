package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Altice device specifications for Android Compose previews.
 *
 * This extension provides Altice device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Altice.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Altice get() = object {
    /** Altice AlTICE S11 */
    val ALTICE_S11 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Altice AlTICE S12 */
    val ALTICE_S12 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Altice Altice S21 */
    val ALTICE_S21 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Altice ALTICE S43 */
    val ALTICE_S43 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Altice ALTICE S60 */
    val ALTICE_S60 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Altice ALTICE S70 */
    val ALTICE_S70 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Altice E25 */
    val E25 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Altice E54 */
    val E54 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Altice S13 */
    val S13 = "spec:width=540,height=1200,unit=px,dpi=240"

    /** Altice S14 */
    val S14 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Altice S22 */
    val S22 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Altice S23 */
    val S23 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Altice S24 */
    val S24 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Altice S25 */
    val S25 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Altice S32 */
    val S32 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Altice S32_NFC */
    val S32_NFC = "spec:width=480,height=960,unit=px,dpi=240"

    /** Altice S32_Plus */
    val S32_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

    /** Altice S33 */
    val S33 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Altice S34 */
    val S34 = "spec:width=444,height=960,unit=px,dpi=200"

    /** Altice S42 */
    val S42 = "spec:width=540,height=1132,unit=px,dpi=240"

    /** Altice S51 */
    val S51 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Altice S61 */
    val S61 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Altice S64 */
    val S64 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Altice STARACTIVE */
    val STARACTIVE = "spec:width=480,height=854,unit=px,dpi=240"

    /** Altice STARTRAIL 7 */
    val STARTRAIL_7 = "spec:width=480,height=854,unit=px,dpi=240"

}
