package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kobo device specifications for Android Compose previews.
 *
 * This extension provides Kobo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kobo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kobo get() = object {
    /** Kobo Arc */
    val ARC = "spec:width=800,height=1205,unit=px,dpi=213"

    /** Kobo Arc 10HD */
    val ARC_10HD = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Kobo Arc 7 */
    val ARC_7 = "spec:width=600,height=1024,unit=px,dpi=160"

}
