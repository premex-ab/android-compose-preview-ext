package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Yuho device specifications for Android Compose previews.
 *
 * This extension provides Yuho device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Yuho.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Yuho get() = object {
    /** Yuho A1332E */
    val A1332E = "spec:width=480,height=1014,unit=px,dpi=200"

    /** Yuho Netra */
    val NETRA = "spec:width=720,height=1560,unit=px,dpi=240"

    /** Yuho Yuho_Tab10 */
    val YUHO_TAB10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Yuho Yuho_Tab8 */
    val YUHO_TAB8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Yuho YUHO_Y1_StarS */
    val YUHO_Y1_STARS = "spec:width=412,height=502,unit=px,dpi=180"

}
