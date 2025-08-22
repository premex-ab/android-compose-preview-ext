package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Stfmobile device specifications for Android Compose previews.
 *
 * This extension provides Stfmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Stfmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Stfmobile get() = object {
    /** Stfmobile AURA */
    val AURA = "spec:width=480,height=960,unit=px,dpi=240"

    /** Stfmobile BLOCK_3 */
    val BLOCK_3 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Stfmobile BLOCK_GO */
    val BLOCK_GO = "spec:width=480,height=854,unit=px,dpi=240"

    /** Stfmobile BLOCK MINI */
    val BLOCK_MINI = "spec:width=480,height=800,unit=px,dpi=240"

    /** Stfmobile STF-BLOCK */
    val STF_BLOCK = "spec:width=480,height=854,unit=px,dpi=240"

}
