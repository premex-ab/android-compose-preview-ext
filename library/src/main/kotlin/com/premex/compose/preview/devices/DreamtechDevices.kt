package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dreamtech device specifications for Android Compose previews.
 *
 * This extension provides Dreamtech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dreamtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dreamtech get() = object {
    /** Dreamtech DTECH10 */
    val DTECH10 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Dreamtech KIDDOTAB10 */
    val KIDDOTAB10 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Dreamtech STARPAD */
    val STARPAD = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dreamtech STARPAD_PLUS */
    val STARPAD_PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dreamtech VOLTA_X */
    val VOLTA_X = "spec:width=800,height=1280,unit=px,dpi=213"

}
