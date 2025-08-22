package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Docomo device specifications for Android Compose previews.
 *
 * This extension provides Docomo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Docomo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Docomo get() = object {
    /** Docomo d-01J */
    val D_01J = "spec:width=1600,height=2560,unit=px,dpi=400"

    /** Docomo d-01K */
    val D_01K = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Docomo d-02K */
    val D_02K = "spec:width=1200,height=1920,unit=px,dpi=320"

}
