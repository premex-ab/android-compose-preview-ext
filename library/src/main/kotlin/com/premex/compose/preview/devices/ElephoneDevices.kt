package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Elephone device specifications for Android Compose previews.
 *
 * This extension provides Elephone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Elephone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Elephone get() = object {
    /** Elephone A3_Pro */
    val A3_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Elephone A4 */
    val A4 = "spec:width=720,height=1512,unit=px,dpi=320"

    /** Elephone A4_Pro */
    val A4_PRO = "spec:width=720,height=1512,unit=px,dpi=320"

    /** Elephone A5 */
    val A5 = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Elephone A6_Max */
    val A6_MAX = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Elephone A6_mini */
    val A6_MINI = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Elephone A7H */
    val A7H = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Elephone E10 */
    val E10 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Elephone E10_Pro */
    val E10_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Elephone P11 */
    val P11 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Elephone P8 3D */
    val P8_3D = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Elephone P8 Max */
    val P8_MAX = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Elephone PX */
    val PX = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Elephone PX_Pro */
    val PX_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Elephone Soldier */
    val SOLDIER = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** Elephone U */
    val U = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Elephone U3H */
    val U3H = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Elephone U5 */
    val U5 = "spec:width=1080,height=2310,unit=px,dpi=480"

    /** Elephone U_Pro */
    val U_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Elephone W3 */
    val W3 = "spec:width=720,height=1520,unit=px,dpi=320"

}
