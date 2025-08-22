package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ematic device specifications for Android Compose previews.
 *
 * This extension provides Ematic device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ematic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ematic get() = object {
    /** Ematic EGQ101 */
    val EGQ101 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ematic EGQ235SK */
    val EGQ235SK = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ematic EGQ236BD */
    val EGQ236BD = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ematic EGQ238BD */
    val EGQ238BD = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ematic Ematic */
    val EMATIC = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ematic PBSKD7200 */
    val PBSKD7200 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ematic PBS Kids PlayPad */
    val PBS_KIDS_PLAYPAD = "spec:width=600,height=1024,unit=px,dpi=160"

}
