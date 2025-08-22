package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Agmobile device specifications for Android Compose previews.
 *
 * This extension provides Agmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Agmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Agmobile get() = object {
    /** Agmobile  AGM A10  */
    val AGM_A10 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Agmobile AGM A9 */
    val AGM_A9 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Agmobile AGM X3 */
    val AGM_X3 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Agmobile HASHTAG */
    val HASHTAG = "spec:width=720,height=1280,unit=px,dpi=320"

}
