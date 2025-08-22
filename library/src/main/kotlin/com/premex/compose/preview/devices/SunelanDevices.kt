package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sunelan device specifications for Android Compose previews.
 *
 * This extension provides Sunelan device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sunelan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sunelan get() = object {
    /** Sunelan Mountain M8 */
    val MOUNTAIN_M8 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Sunelan River X1 */
    val RIVER_X1 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Sunelan River X3 */
    val RIVER_X3 = "spec:width=720,height=1600,unit=px,dpi=320"

}
