package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Angeltech device specifications for Android Compose previews.
 *
 * This extension provides Angeltech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Angeltech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Angeltech get() = object {
    /** Angeltech E109GCM  */
    val E109GCM = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Angeltech P80 */
    val P80 = "spec:width=800,height=1280,unit=px,dpi=220"

}
