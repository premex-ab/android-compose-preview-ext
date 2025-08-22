package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Etelpremium device specifications for Android Compose previews.
 *
 * This extension provides Etelpremium device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Etelpremium.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Etelpremium get() = object {
    /** Etelpremium E26 */
    val E26 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Etelpremium E65 */
    val E65 = "spec:width=720,height=1600,unit=px,dpi=480"

    /** Etelpremium NOTE 25 ULTRA */
    val NOTE_25_ULTRA = "spec:width=720,height=1640,unit=px,dpi=320"

}
