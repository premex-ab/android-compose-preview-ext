package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Senseit device specifications for Android Compose previews.
 *
 * This extension provides Senseit device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Senseit.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Senseit get() = object {
    /** Senseit A109 */
    val A109 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Senseit Senseit_J2 */
    val SENSEIT_J2 = "spec:width=600,height=1024,unit=px,dpi=160"

}
