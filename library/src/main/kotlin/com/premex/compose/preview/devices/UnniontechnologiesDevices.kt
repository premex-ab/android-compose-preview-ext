package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Unniontechnologies device specifications for Android Compose previews.
 *
 * This extension provides Unniontechnologies device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Unniontechnologies.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Unniontechnologies get() = object {
    /** Unniontechnologies UN-CT101 */
    val UN_CT101 = "spec:width=800,height=1280,unit=px,dpi=190"

    /** Unniontechnologies UNSP7 */
    val UNSP7 = "spec:width=720,height=1440,unit=px,dpi=320"

}
