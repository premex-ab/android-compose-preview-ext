package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Seuic device specifications for Android Compose previews.
 *
 * This extension provides Seuic device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Seuic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Seuic get() = object {
    /** Seuic AUTOID10 */
    val AUTOID10 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Seuic AUTOID9N */
    val AUTOID9N = "spec:width=480,height=800,unit=px,dpi=240"

    /** Seuic AUTOID Pad Air */
    val AUTOID_PAD_AIR = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Seuic AUTOID Pad Air-5G */
    val AUTOID_PAD_AIR_5G = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Seuic AUTOID Q7 */
    val AUTOID_Q7 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Seuic AUTOIDQ9 */
    val AUTOIDQ9 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Seuic AUTOIDQ9G */
    val AUTOIDQ9G = "spec:width=480,height=800,unit=px,dpi=240"

    /** Seuic CRUISE1 */
    val CRUISE1 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Seuic CRUISE2 */
    val CRUISE2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Seuic CRUISE2 5G */
    val CRUISE2_5G = "spec:width=1080,height=2160,unit=px,dpi=480"

}
