package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Jren device specifications for Android Compose previews.
 *
 * This extension provides Jren device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Jren.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Jren get() = object {
    /** Jren J10 */
    val J10 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Jren J10PLUS */
    val J10PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Jren J10PRO */
    val J10PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Jren J11 */
    val J11 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Jren J11PLUS */
    val J11PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Jren JR-802 */
    val JR_802 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Jren JR_J1063 */
    val JR_J1063 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Jren JR-J10A */
    val JR_J10A = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Jren JR_J7 */
    val JR_J7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Jren JR-J71 */
    val JR_J71 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Jren JR-J8 */
    val JR_J8 = "spec:width=800,height=1280,unit=px,dpi=213"

}
