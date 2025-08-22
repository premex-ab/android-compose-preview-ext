package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nextbit device specifications for Android Compose previews.
 *
 * This extension provides Nextbit device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nextbit.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nextbit get() = object {
    /** Nextbit Robin */
    val ROBIN = "spec:width=1080,height=1920,unit=px,dpi=480"

}
