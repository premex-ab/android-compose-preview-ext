package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Jinga device specifications for Android Compose previews.
 *
 * This extension provides Jinga device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Jinga.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Jinga get() = object {
    /** Jinga GoalPlus */
    val GOALPLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Jinga Jinga Hit4G */
    val JINGA_HIT4G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Jinga Neon */
    val NEON = "spec:width=480,height=800,unit=px,dpi=240"

    /** Jinga Pass Plus */
    val PASS_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

    /** Jinga Picasso Note */
    val PICASSO_NOTE = "spec:width=480,height=996,unit=px,dpi=240"

    /** Jinga Touch 4G */
    val TOUCH_4G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Jinga WinPRO */
    val WINPRO = "spec:width=720,height=1440,unit=px,dpi=320"

}
