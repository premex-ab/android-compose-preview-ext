package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Facilotab device specifications for Android Compose previews.
 *
 * This extension provides Facilotab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Facilotab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Facilotab get() = object {
    /** Facilotab Facilotab_L_Rubis */
    val FACILOTAB_L_RUBIS = "spec:width=1200,height=1920,unit=px,dpi=240"

}
