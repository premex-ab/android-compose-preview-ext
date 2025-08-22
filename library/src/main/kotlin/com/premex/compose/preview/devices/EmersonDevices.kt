package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Emerson device specifications for Android Compose previews.
 *
 * This extension provides Emerson device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Emerson.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Emerson get() = object {
    /** Emerson EID_1050  */
    val EID_1050 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Emerson EID_1061 */
    val EID_1061 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Emerson EID-1400 */
    val EID_1400 = "spec:width=1080,height=1920,unit=px,dpi=320"

    /** Emerson EID_9000 */
    val EID_9000 = "spec:width=600,height=1024,unit=px,dpi=160"

}
