package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Topsand device specifications for Android Compose previews.
 *
 * This extension provides Topsand device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Topsand.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Topsand get() = object {
    /** Topsand G12 */
    val G12 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Topsand M8_U */
    val M8_U = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Topsand N10 */
    val N10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Topsand N8 */
    val N8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Topsand N8_KIDS */
    val N8_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Topsand N8_Plus */
    val N8_PLUS = "spec:width=800,height=1340,unit=px,dpi=213"

}
