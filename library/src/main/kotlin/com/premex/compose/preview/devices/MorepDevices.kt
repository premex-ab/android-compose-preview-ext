package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Morep device specifications for Android Compose previews.
 *
 * This extension provides Morep device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Morep.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Morep get() = object {
    /** Morep Mavic 10 */
    val MAVIC_10 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Morep Morep Mavic 10 */
    val MOREP_MAVIC_10 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Morep Morep Mavic Plus */
    val MOREP_MAVIC_PLUS = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Morep Smart V1 */
    val SMART_V1 = "spec:width=480,height=854,unit=px,dpi=200"

}
