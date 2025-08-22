package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Smartkassel device specifications for Android Compose previews.
 *
 * This extension provides Smartkassel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Smartkassel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Smartkassel get() = object {
    /** Smartkassel ARGENTINA */
    val ARGENTINA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Smartkassel SK3403 */
    val SK3403 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Smartkassel SK3404 */
    val SK3404 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Smartkassel SK3405 */
    val SK3405 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Smartkassel SK3501 */
    val SK3501 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Smartkassel SK5501 */
    val SK5501 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Smartkassel SK5502 */
    val SK5502 = "spec:width=800,height=1280,unit=px,dpi=160"

}
