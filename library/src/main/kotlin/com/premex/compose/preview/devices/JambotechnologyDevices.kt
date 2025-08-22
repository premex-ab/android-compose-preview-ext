package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Jambotechnology device specifications for Android Compose previews.
 *
 * This extension provides Jambotechnology device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Jambotechnology.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Jambotechnology get() = object {
    /** Jambotechnology JamboPhone */
    val JAMBOPHONE = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Jambotechnology JamboPhone2 */
    val JAMBOPHONE2 = "spec:width=720,height=1600,unit=px,dpi=320"

}
