package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hipstreet device specifications for Android Compose previews.
 *
 * This extension provides Hipstreet device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hipstreet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hipstreet get() = object {
    /** Hipstreet  Joey Jet 2 */
    val JOEY_JET_2 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Hipstreet LS-4004 */
    val LS_4004 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Hipstreet LS-5017 */
    val LS_5017 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Hipstreet LS-5507 */
    val LS_5507 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Hipstreet Pilot */
    val PILOT = "spec:width=600,height=1024,unit=px,dpi=160"

}
