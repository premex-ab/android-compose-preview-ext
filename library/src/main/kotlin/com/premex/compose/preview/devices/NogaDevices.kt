package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Noga device specifications for Android Compose previews.
 *
 * This extension provides Noga device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Noga.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Noga get() = object {
    /** Noga NOGA101GHD */
    val NOGA101GHD = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Noga NOGA7 */
    val NOGA7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Noga NOGA7G */
    val NOGA7G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Noga NOGAPAD101GHD */
    val NOGAPAD101GHD = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Noga NOGAPAD101XTREME */
    val NOGAPAD101XTREME = "spec:width=1200,height=1920,unit=px,dpi=280"

}
