package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hiking device specifications for Android Compose previews.
 *
 * This extension provides Hiking device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hiking.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hiking get() = object {
    /** Hiking A19 */
    val A19 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Hiking A20 */
    val A20 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Hiking A21 */
    val A21 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Hiking A22 */
    val A22 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Hiking A23 */
    val A23 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Hiking A26 */
    val A26 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Hiking A27 */
    val A27 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Hiking A28 */
    val A28 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Hiking A30 */
    val A30 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Hiking A40 */
    val A40 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Hiking A42 */
    val A42 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Hiking A43 */
    val A43 = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Hiking A44 */
    val A44 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Hiking A45 */
    val A45 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Hiking A46 */
    val A46 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Hiking A51 */
    val A51 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Hiking A55 */
    val A55 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Hiking KIDS_1 */
    val KIDS_1 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hiking Rugged_S1 */
    val RUGGED_S1 = "spec:width=576,height=1280,unit=px,dpi=240"

    /** Hiking Rugged S2 */
    val RUGGED_S2 = "spec:width=576,height=1280,unit=px,dpi=240"

}
