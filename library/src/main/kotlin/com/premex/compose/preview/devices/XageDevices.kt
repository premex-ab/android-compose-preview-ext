package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Xage device specifications for Android Compose previews.
 *
 * This extension provides Xage device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Xage.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Xage get() = object {
    /** Xage A1 */
    val A1 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Xage ACE */
    val ACE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Xage G1 */
    val G1 = "spec:width=720,height=1500,unit=px,dpi=320"

    /** Xage G1LITE */
    val G1LITE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Xage G2 */
    val G2 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Xage X_AGE_Leap_1 */
    val X_AGE_LEAP_1 = "spec:width=720,height=1612,unit=px,dpi=300"

    /** Xage X_AGE_Snap_1 */
    val X_AGE_SNAP_1 = "spec:width=720,height=1640,unit=px,dpi=320"

}
