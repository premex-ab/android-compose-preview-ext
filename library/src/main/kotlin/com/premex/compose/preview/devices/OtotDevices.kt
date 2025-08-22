package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Otot device specifications for Android Compose previews.
 *
 * This extension provides Otot device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Otot.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Otot get() = object {
    /** Otot H10 */
    val H10 = "spec:width=720,height=1512,unit=px,dpi=272"

    /** Otot PS8 */
    val PS8 = "spec:width=600,height=1024,unit=px,dpi=160"

}
