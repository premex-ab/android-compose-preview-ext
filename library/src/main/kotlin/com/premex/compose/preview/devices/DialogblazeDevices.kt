package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dialogblaze device specifications for Android Compose previews.
 *
 * This extension provides Dialogblaze device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dialogblaze.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dialogblaze get() = object {
    /** Dialogblaze Dialog_Blaze_Mini */
    val DIALOG_BLAZE_MINI = "spec:width=480,height=800,unit=px,dpi=240"

    /** Dialogblaze M50E-1A */
    val M50E_1A = "spec:width=480,height=854,unit=px,dpi=240"

}
