package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ibrit device specifications for Android Compose previews.
 *
 * This extension provides Ibrit device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ibrit.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ibrit get() = object {
    /** Ibrit Alpha */
    val ALPHA = "spec:width=480,height=854,unit=px,dpi=240"

    /** Ibrit i5+ */
    val I5 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ibrit IB6001 */
    val IB6001 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Ibrit iBRIT */
    val IBRIT = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Ibrit IBRIT_I5 */
    val IBRIT_I5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Ibrit iBRIT_POWER6 */
    val IBRIT_POWER6 = "spec:width=480,height=996,unit=px,dpi=240"

    /** Ibrit iBRIT SpeedX */
    val IBRIT_SPEEDX = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Ibrit MAX10 */
    val MAX10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ibrit MAX10-1 */
    val MAX10_1 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ibrit MAX12 */
    val MAX12 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ibrit Max12pro */
    val MAX12PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ibrit MAX15 */
    val MAX15 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ibrit POWER_X */
    val POWER_X = "spec:width=480,height=996,unit=px,dpi=240"

    /** Ibrit Z2 */
    val Z2 = "spec:width=640,height=1280,unit=px,dpi=320"

}
