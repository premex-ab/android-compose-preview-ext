package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Handheldgroup device specifications for Android Compose previews.
 *
 * This extension provides Handheldgroup device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Handheldgroup.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Handheldgroup get() = object {
    /** Handheldgroup ALGIZ RT10 */
    val ALGIZ_RT10 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Handheldgroup Algiz RT7 */
    val ALGIZ_RT7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Handheldgroup ALGIZ RT8 */
    val ALGIZ_RT8 = "spec:width=1200,height=1920,unit=px,dpi=480"

    /** Handheldgroup Nautiz X2 */
    val NAUTIZ_X2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Handheldgroup Nautiz X2 EEA */
    val NAUTIZ_X2_EEA = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Handheldgroup Nautiz X41 */
    val NAUTIZ_X41 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Handheldgroup Nautiz X41 EEA */
    val NAUTIZ_X41_EEA = "spec:width=480,height=800,unit=px,dpi=240"

    /** Handheldgroup NAUTIZ X6 */
    val NAUTIZ_X6 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Handheldgroup Nautiz X9 */
    val NAUTIZ_X9 = "spec:width=720,height=1280,unit=px,dpi=320"

}
