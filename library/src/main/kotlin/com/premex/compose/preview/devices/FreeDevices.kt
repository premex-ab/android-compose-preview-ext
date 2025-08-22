package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Free device specifications for Android Compose previews.
 *
 * This extension provides Free device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Free.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Free get() = object {
    /** Free Free_Liberty_Plus */
    val FREE_LIBERTY_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

}
