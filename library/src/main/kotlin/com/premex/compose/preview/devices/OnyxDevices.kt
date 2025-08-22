package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Onyx device specifications for Android Compose previews.
 *
 * This extension provides Onyx device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Onyx.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Onyx get() = object {
    /** Onyx AKA Model A */
    val AKA_MODEL_A = "spec:width=480,height=854,unit=px,dpi=240"

    /** Onyx BOOX */
    val BOOX = "spec:width=1404,height=1872,unit=px,dpi=240"

}
