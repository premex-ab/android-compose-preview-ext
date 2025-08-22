package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Isafe device specifications for Android Compose previews.
 *
 * This extension provides Isafe device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Isafe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Isafe get() = object {
    /** Isafe IS520.1 */
    val IS520_1 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Isafe IS655 */
    val IS655 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Isafe IS880 */
    val IS880 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Isafe IS910.1 */
    val IS910_1 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Isafe IS940 */
    val IS940 = "spec:width=1200,height=1920,unit=px,dpi=320"

}
