package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nabi device specifications for Android Compose previews.
 *
 * This extension provides Nabi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nabi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nabi get() = object {
    /** Nabi 2S Tablet */
    val _2S_TABLET = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Nabi 2 Tablet */
    val _2_TABLET = "spec:width=552,height=1024,unit=px,dpi=160"

    /** Nabi American Girl Tablet */
    val AMERICAN_GIRL_TABLET = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Nabi Big Tab HD™ 20 */
    val BIG_TAB_HD_20 = "spec:width=900,height=1600,unit=px,dpi=213"

    /** Nabi Big Tab HD™ 24 */
    val BIG_TAB_HD_24 = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Nabi Fisher Price Learning Tablet */
    val FISHER_PRICE_LEARNING_TABLET = "spec:width=600,height=1024,unit=px,dpi=160"

}
