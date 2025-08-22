package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Unistrong device specifications for Android Compose previews.
 *
 * This extension provides Unistrong device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Unistrong.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Unistrong get() = object {
    /** Unistrong UT10 */
    val UT10 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Unistrong UT12 */
    val UT12 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Unistrong UT12P */
    val UT12P = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Unistrong UT30_EEA */
    val UT30_EEA = "spec:width=800,height=1280,unit=px,dpi=320"

    /** Unistrong UT32 */
    val UT32 = "spec:width=800,height=1280,unit=px,dpi=320"

    /** Unistrong UT56 */
    val UT56 = "spec:width=800,height=1280,unit=px,dpi=213"

}
