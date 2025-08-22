package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bluedot device specifications for Android Compose previews.
 *
 * This extension provides Bluedot device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bluedot.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bluedot get() = object {
    /** Bluedot BNT_1012W */
    val BNT_1012W = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Bluedot BNT-1013 */
    val BNT_1013 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Bluedot BNT-801W */
    val BNT_801W = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Bluedot BNT-802 */
    val BNT_802 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
