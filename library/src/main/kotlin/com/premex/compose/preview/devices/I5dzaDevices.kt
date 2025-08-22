package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * I5dza device specifications for Android Compose previews.
 *
 * This extension provides I5dza device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.I5dza.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.I5dza get() = object {
    /** I5dza TABLET_PC */
    val TABLET_PC = "spec:width=800,height=1280,unit=px,dpi=160"

    /** I5dza V10 */
    val V10 = "spec:width=480,height=1014,unit=px,dpi=213"

}
