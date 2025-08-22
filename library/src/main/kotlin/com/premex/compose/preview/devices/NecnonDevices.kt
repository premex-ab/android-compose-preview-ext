package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Necnon device specifications for Android Compose previews.
 *
 * This extension provides Necnon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Necnon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Necnon get() = object {
    /** Necnon 3L-2 */
    val _3L_2 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Necnon M002K-2 */
    val M002K_2 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Necnon M002Q-2 */
    val M002Q_2 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Necnon M002U_2T */
    val M002U_2T = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Necnon MOO2N-3T */
    val MOO2N_3T = "spec:width=600,height=1024,unit=px,dpi=160"

}
