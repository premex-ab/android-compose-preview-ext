package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Colorsmobile device specifications for Android Compose previews.
 *
 * This extension provides Colorsmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Colorsmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Colorsmobile get() = object {
    /** Colorsmobile P77_Pride_1E */
    val P77_PRIDE_1E = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Colorsmobile P88_Pride_1X */
    val P88_PRIDE_1X = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Colorsmobile P95_Pride_7s */
    val P95_PRIDE_7S = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Colorsmobile Pride 5C */
    val PRIDE_5C = "spec:width=480,height=1014,unit=px,dpi=220"

}
