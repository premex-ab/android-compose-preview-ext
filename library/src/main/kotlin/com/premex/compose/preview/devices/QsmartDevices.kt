package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Qsmart device specifications for Android Compose previews.
 *
 * This extension provides Qsmart device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Qsmart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Qsmart get() = object {
    /** Qsmart GLi */
    val GLI = "spec:width=480,height=800,unit=px,dpi=240"

    /** Qsmart Hot 1 */
    val HOT_1 = "spec:width=720,height=1480,unit=px,dpi=320"

    /** Qsmart Hot 5 */
    val HOT_5 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Qsmart i10 2019 */
    val I10_2019 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Qsmart i10_2020 */
    val I10_2020 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Qsmart i5i 2019 */
    val I5I_2019 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Qsmart i6i_2020 */
    val I6I_2020 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Qsmart LT900 */
    val LT900 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Qsmart LT950 */
    val LT950 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Qsmart Mark 2 */
    val MARK_2 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Qsmart QSmart Blaze */
    val QSMART_BLAZE = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Qsmart QSmart i4i */
    val QSMART_I4I = "spec:width=480,height=960,unit=px,dpi=240"

    /** Qsmart QSmart Rocket */
    val QSMART_ROCKET = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Qsmart QSmart Ultra */
    val QSMART_ULTRA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Qsmart QSmart X10 */
    val QSMART_X10 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Qsmart QSmart X20 */
    val QSMART_X20 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Qsmart QSmart X40 */
    val QSMART_X40 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Qsmart Rocket_Lite */
    val ROCKET_LITE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Qsmart Smart 8 */
    val SMART_8 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Qsmart Smart HD Pro */
    val SMART_HD_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Qsmart View */
    val VIEW = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Qsmart View Max */
    val VIEW_MAX = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Qsmart View Max Pro */
    val VIEW_MAX_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

}
