package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Meitu device specifications for Android Compose previews.
 *
 * This extension provides Meitu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Meitu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Meitu get() = object {
    /** Meitu M6 */
    val M6 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Meitu M8s */
    val M8S = "spec:width=1080,height=2220,unit=px,dpi=440"

    /** Meitu Maya */
    val MAYA = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Meitu Meitu T8s */
    val MEITU_T8S = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Meitu Meitu V6 */
    val MEITU_V6 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Meitu MI CC 9 Meitu Edition */
    val MI_CC_9_MEITU_EDITION = "spec:width=1080,height=2340,unit=px,dpi=440"

    /** Meitu T9 */
    val T9 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Meitu T9 */
    val T9_1080X2244 = "spec:width=1080,height=2244,unit=px,dpi=480"

    /** Meitu Victoria */
    val VICTORIA = "spec:width=1080,height=1920,unit=px,dpi=480"

}
