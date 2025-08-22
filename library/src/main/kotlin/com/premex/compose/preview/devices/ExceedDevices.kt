package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Exceed device specifications for Android Compose previews.
 *
 * This extension provides Exceed device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Exceed.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Exceed get() = object {
    /** Exceed E10G22 */
    val E10G22 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Exceed E10W10 */
    val E10W10 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Exceed E22 */
    val E22 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Exceed EX10S10 */
    val EX10S10 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Exceed EX10S4 */
    val EX10S4 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Exceed EX7S4 */
    val EX7S4 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Exceed EX7SL4 */
    val EX7SL4 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Exceed EX7W1S */
    val EX7W1S = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Exceed EX7W4 */
    val EX7W4 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Exceed EX7X4 */
    val EX7X4 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Exceed EX8S1 */
    val EX8S1 = "spec:width=800,height=1280,unit=px,dpi=213"

}
