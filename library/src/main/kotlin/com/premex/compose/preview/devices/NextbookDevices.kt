package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nextbook device specifications for Android Compose previews.
 *
 * This extension provides Nextbook device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nextbook.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nextbook get() = object {
    /** Nextbook BRT81 */
    val BRT81 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Nextbook NX16A10132S */
    val NX16A10132S = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Nextbook NX16A10132SPS */
    val NX16A10132SPS = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Nextbook NX16A11264 */
    val NX16A11264 = "spec:width=768,height=1366,unit=px,dpi=160"

    /** Nextbook NX16A8116K */
    val NX16A8116K = "spec:width=1440,height=3120,unit=px,dpi=560"

    /** Nextbook NX16A8116KP */
    val NX16A8116KP = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Nextbook NX785QC8G */
    val NX785QC8G = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Nextbook NXA116QC164 */
    val NXA116QC164 = "spec:width=768,height=1366,unit=px,dpi=160"

    /** Nextbook NXA8QC116 */
    val NXA8QC116 = "spec:width=800,height=1280,unit=px,dpi=160"

}
