package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dbmmaroc device specifications for Android Compose previews.
 *
 * This extension provides Dbmmaroc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dbmmaroc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dbmmaroc get() = object {
    /** Dbmmaroc Accent Speed Y3 */
    val ACCENT_SPEED_Y3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Dbmmaroc Speed X2 */
    val SPEED_X2 = "spec:width=720,height=1280,unit=px,dpi=320"

}
