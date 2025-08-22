package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bitmore device specifications for Android Compose previews.
 *
 * This extension provides Bitmore device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bitmore.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bitmore get() = object {
    /** Bitmore Mobitab10_S3_32GB */
    val MOBITAB10_S3_32GB = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Bitmore Tab10_Plus_32GB */
    val TAB10_PLUS_32GB = "spec:width=800,height=1280,unit=px,dpi=160"

}
