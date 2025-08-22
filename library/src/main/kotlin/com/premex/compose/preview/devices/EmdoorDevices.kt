package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Emdoor device specifications for Android Compose previews.
 *
 * This extension provides Emdoor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Emdoor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Emdoor get() = object {
    /** Emdoor ARKENSTONE */
    val ARKENSTONE = "spec:width=720,height=1612,unit=px,dpi=320"

}
