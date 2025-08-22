package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Topelotek device specifications for Android Compose previews.
 *
 * This extension provides Topelotek device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Topelotek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Topelotek get() = object {
    /** Topelotek KIDS06 */
    val KIDS06 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Topelotek KIDS708_709A */
    val KIDS708_709A = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Topelotek KIDS709 */
    val KIDS709 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Topelotek KIDS720 */
    val KIDS720 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Topelotek V7 */
    val V7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Topelotek Y8 */
    val Y8 = "spec:width=600,height=1024,unit=px,dpi=160"

}
