package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dgtec device specifications for Android Compose previews.
 *
 * This extension provides Dgtec device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dgtec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dgtec get() = object {
    /** Dgtec  DG101HSTB  */
    val DG101HSTB = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dgtec DG101SVCB */
    val DG101SVCB = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Dgtec DG101TBLS */
    val DG101TBLS = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Dgtec DG7TBIPSPA */
    val DG7TBIPSPA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Dgtec DGIPS7 */
    val DGIPS7 = "spec:width=600,height=1024,unit=px,dpi=160"

}
