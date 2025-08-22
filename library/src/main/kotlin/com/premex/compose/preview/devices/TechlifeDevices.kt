package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Techlife device specifications for Android Compose previews.
 *
 * This extension provides Techlife device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Techlife.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Techlife get() = object {
    /** Techlife TLPAD001 */
    val TLPAD001 = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Techlife TLPAD002 */
    val TLPAD002 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Techlife TLPADP04 */
    val TLPADP04 = "spec:width=1200,height=2000,unit=px,dpi=280"

}
