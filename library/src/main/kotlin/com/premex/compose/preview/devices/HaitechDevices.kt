package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Haitech device specifications for Android Compose previews.
 *
 * This extension provides Haitech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Haitech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Haitech get() = object {
    /** Haitech HIP-T66 */
    val HIP_T66 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Haitech HPAD_IA65 */
    val HPAD_IA65 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Haitech HPAD_IP8045 */
    val HPAD_IP8045 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Haitech HPAD_IP8045_1 */
    val HPAD_IP8045_1 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Haitech HPAD-M2 */
    val HPAD_M2 = "spec:width=800,height=1280,unit=px,dpi=213"

}
