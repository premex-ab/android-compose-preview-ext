package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vimoq device specifications for Android Compose previews.
 *
 * This extension provides Vimoq device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vimoq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vimoq get() = object {
    /** Vimoq SE668S */
    val SE668S = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Vimoq VIMOQ A49 Play */
    val VIMOQ_A49_PLAY = "spec:width=480,height=1014,unit=px,dpi=200"

    /** Vimoq VIMOQ Vision 3 */
    val VIMOQ_VISION_3 = "spec:width=720,height=1612,unit=px,dpi=320"

}
