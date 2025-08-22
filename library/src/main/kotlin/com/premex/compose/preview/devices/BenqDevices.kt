package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Benq device specifications for Android Compose previews.
 *
 * This extension provides Benq device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Benq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Benq get() = object {
    /** Benq Harrier Mini */
    val HARRIER_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Benq Harrier Tab */
    val HARRIER_TAB = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Benq RE04N_series */
    val RE04N_SERIES = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Benq RE04_series */
    val RE04_SERIES = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Benq RM6504 */
    val RM6504 = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Benq RM7504 */
    val RM7504 = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Benq RM8604 */
    val RM8604 = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Benq RP6504 */
    val RP6504 = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Benq RP7504 */
    val RP7504 = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Benq RP8604 */
    val RP8604 = "spec:width=2160,height=3840,unit=px,dpi=480"

}
