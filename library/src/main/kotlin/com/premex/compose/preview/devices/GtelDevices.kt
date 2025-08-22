package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gtel device specifications for Android Compose previews.
 *
 * This extension provides Gtel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gtel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gtel get() = object {
    /** Gtel A737_XploraZ */
    val A737_XPLORAZ = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gtel Delta_14 */
    val DELTA_14 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Gtel Gtel_Delta_16 */
    val GTEL_DELTA_16 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Gtel Gtel Infinity 8s */
    val GTEL_INFINITY_8S = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Gtel Gtel_Infinity_9 */
    val GTEL_INFINITY_9 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Gtel Gtel_Infinity_X */
    val GTEL_INFINITY_X = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Gtel Gtel X6mini */
    val GTEL_X6MINI = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gtel Gtel X6plus */
    val GTEL_X6PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Gtel Gtel X6pro */
    val GTEL_X6PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Gtel Gtel X6s */
    val GTEL_X6S = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Gtel Gtel X7plus */
    val GTEL_X7PLUS = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Gtel Gtel X7pro */
    val GTEL_X7PRO = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Gtel Gtel X7s */
    val GTEL_X7S = "spec:width=720,height=1500,unit=px,dpi=320"

    /** Gtel Infinity_13 */
    val INFINITY_13 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Gtel Infinity 7 Plus */
    val INFINITY_7_PLUS = "spec:width=720,height=1528,unit=px,dpi=280"

    /** Gtel Infinity 7 Pro */
    val INFINITY_7_PRO = "spec:width=720,height=1528,unit=px,dpi=280"

    /** Gtel Mx6 */
    val MX6 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Gtel X5 */
    val X5 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Gtel X5plus */
    val X5PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

}
