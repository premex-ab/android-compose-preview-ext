package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Catchtable device specifications for Android Compose previews.
 *
 * This extension provides Catchtable device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Catchtable.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Catchtable get() = object {
    /** Catchtable AZ101FC */
    val AZ101FC = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Catchtable AZ101FCN */
    val AZ101FCN = "spec:width=1200,height=1920,unit=px,dpi=240"

}
