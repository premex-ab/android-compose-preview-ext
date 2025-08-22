package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Aauw device specifications for Android Compose previews.
 *
 * This extension provides Aauw device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Aauw.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Aauw get() = object {
    /** Aauw M50 */
    val M50 = "spec:width=1200,height=2000,unit=px,dpi=260"

    /** Aauw M50_NEW */
    val M50_NEW = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Aauw M60_NEW */
    val M60_NEW = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Aauw T10 */
    val T10 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Aauw T_50 */
    val T_50 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Aauw T50_2023 */
    val T50_2023 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Aauw T60Pro */
    val T60PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Aauw T60Pro_2023 */
    val T60PRO_2023 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Aauw T90 */
    val T90 = "spec:width=1200,height=1920,unit=px,dpi=272"

}
