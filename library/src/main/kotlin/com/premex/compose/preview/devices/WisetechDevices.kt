package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Wisetech device specifications for Android Compose previews.
 *
 * This extension provides Wisetech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Wisetech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Wisetech get() = object {
    /** Wisetech P33 */
    val P33 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Wisetech P55 */
    val P55 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Wisetech Tech-A1 */
    val TECH_A1 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Wisetech Tech_A1_Plus */
    val TECH_A1_PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Wisetech Wise-Tech_M1 */
    val WISE_TECH_M1 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Wisetech WiseTech_Note_10 */
    val WISETECH_NOTE_10 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Wisetech WiseTech_Note_12 */
    val WISETECH_NOTE_12 = "spec:width=720,height=1640,unit=px,dpi=320"

}
