package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gfive device specifications for Android Compose previews.
 *
 * This extension provides Gfive device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gfive.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gfive get() = object {
    /** Gfive PRESIDENT_GOLD_10 */
    val PRESIDENT_GOLD_10 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Gfive PRESIDENT_GOLD_9 */
    val PRESIDENT_GOLD_9 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Gfive Speedo_1 */
    val SPEEDO_1 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Gfive Stark */
    val STARK = "spec:width=480,height=960,unit=px,dpi=240"

}
