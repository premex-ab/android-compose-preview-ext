package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ikon device specifications for Android Compose previews.
 *
 * This extension provides Ikon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ikon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ikon get() = object {
    /** Ikon IK-1025 */
    val IK_1025 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Ikon IK-1106 */
    val IK_1106 = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Ikon IK-7108 */
    val IK_7108 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Ikon IK-869 */
    val IK_869 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Ikon IKON */
    val IKON = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ikon IK-T808 */
    val IK_T808 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ikon IK_WA024 */
    val IK_WA024 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ikon IK-WT028i */
    val IK_WT028I = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Ikon IK-WT1080 */
    val IK_WT1080 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ikon IK-WT1088 */
    val IK_WT1088 = "spec:width=800,height=1280,unit=px,dpi=170"

}
