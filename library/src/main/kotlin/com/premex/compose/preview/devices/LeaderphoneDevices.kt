package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Leaderphone device specifications for Android Compose previews.
 *
 * This extension provides Leaderphone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Leaderphone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Leaderphone get() = object {
    /** Leaderphone Alphatel_T1 */
    val ALPHATEL_T1 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Leaderphone Vyper */
    val VYPER = "spec:width=480,height=960,unit=px,dpi=240"

}
