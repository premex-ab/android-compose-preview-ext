package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Rhino device specifications for Android Compose previews.
 *
 * This extension provides Rhino device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Rhino.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Rhino get() = object {
    /** Rhino RHINO C6 */
    val RHINO_C6 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Rhino RHINO M10p */
    val RHINO_M10P = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Rhino RHINO PACE */
    val RHINO_PACE = "spec:width=480,height=960,unit=px,dpi=213"

    /** Rhino RHINO PACE A1 */
    val RHINO_PACE_A1 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Rhino RHINO T105 */
    val RHINO_T105 = "spec:width=1200,height=1920,unit=px,dpi=260"

    /** Rhino RHINO T8 */
    val RHINO_T8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Rhino RHINO T80 */
    val RHINO_T80 = "spec:width=800,height=1280,unit=px,dpi=213"

}
