package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Brightside device specifications for Android Compose previews.
 *
 * This extension provides Brightside device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Brightside.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Brightside get() = object {
    /** Brightside BS701 */
    val BS701 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Brightside KS_T01 */
    val KS_T01 = "spec:width=1200,height=1920,unit=px,dpi=213"

}
