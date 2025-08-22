package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sugar device specifications for Android Compose previews.
 *
 * This extension provides Sugar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sugar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sugar get() = object {
    /** Sugar Sugar */
    val SUGAR = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sugar SUGAR C11 */
    val SUGAR_C11 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Sugar SUGAR C12 */
    val SUGAR_C12 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Sugar SUGAR C13 */
    val SUGAR_C13 = "spec:width=720,height=1512,unit=px,dpi=320"

    /** Sugar SUGAR C60 */
    val SUGAR_C60 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Sugar SUGAR F20 */
    val SUGAR_F20 = "spec:width=1080,height=2280,unit=px,dpi=480"

    /** Sugar SUGAR P1 */
    val SUGAR_P1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Sugar SUGAR_P11 */
    val SUGAR_P11 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Sugar SUGAR S11 */
    val SUGAR_S11 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Sugar SUGAR S20 */
    val SUGAR_S20 = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Sugar SUGAR S20s */
    val SUGAR_S20S = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Sugar Sugar S30 */
    val SUGAR_S30 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Sugar SUGAR S50 */
    val SUGAR_S50 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Sugar SUGAR S55 */
    val SUGAR_S55 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Sugar SUGAR T10 */
    val SUGAR_T10 = "spec:width=720,height=1520,unit=px,dpi=280"

    /** Sugar SUGAR T20 */
    val SUGAR_T20 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Sugar SUGAR T30 */
    val SUGAR_T30 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Sugar Sugar T50 */
    val SUGAR_T50 = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Sugar SUGAR Y12 */
    val SUGAR_Y12 = "spec:width=1080,height=2220,unit=px,dpi=440"

    /** Sugar SUGAR Y12s */
    val SUGAR_Y12S = "spec:width=480,height=960,unit=px,dpi=240"

    /** Sugar SUGAR Y13s */
    val SUGAR_Y13S = "spec:width=480,height=960,unit=px,dpi=240"

    /** Sugar SUGAR Y15 */
    val SUGAR_Y15 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Sugar SUGAR Y16 */
    val SUGAR_Y16 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Sugar SUGAR_Y18 */
    val SUGAR_Y18 = "spec:width=720,height=1440,unit=px,dpi=320"

}
