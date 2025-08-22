package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Alphaling device specifications for Android Compose previews.
 *
 * This extension provides Alphaling device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Alphaling.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Alphaling get() = object {
    /** Alphaling A97GT */
    val A97GT = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Alphaling A97GT */
    val A97GT_800X1280 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Alphaling A97GT_Pro */
    val A97GT_PRO = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Alphaling P10SU_PLUS */
    val P10SU_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

}
