package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tufen device specifications for Android Compose previews.
 *
 * This extension provides Tufen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tufen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tufen get() = object {
    /** Tufen Q718B_EEA */
    val Q718B_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Tufen Q738 */
    val Q738 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Tufen Q801 */
    val Q801 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Tufen Q88C */
    val Q88C = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Tufen Q88D_FUFEN_EEA */
    val Q88D_FUFEN_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

}
