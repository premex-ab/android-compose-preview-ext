package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Qcell device specifications for Android Compose previews.
 *
 * This extension provides Qcell device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Qcell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Qcell get() = object {
    /** Qcell Qsmart */
    val QSMART = "spec:width=480,height=960,unit=px,dpi=200"

    /** Qcell Qsmart */
    val QSMART_720X1600 = "spec:width=720,height=1600,unit=px,dpi=320"

}
