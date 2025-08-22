package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Naxa device specifications for Android Compose previews.
 *
 * This extension provides Naxa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Naxa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Naxa get() = object {
    /** Naxa Naxa */
    val NAXA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Naxa NID-1050 */
    val NID_1050 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Naxa NID_1056 */
    val NID_1056 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Naxa NID_1070 */
    val NID_1070 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Naxa NID_7021 */
    val NID_7021 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Naxa NID_7022 */
    val NID_7022 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Naxa NID_7056 */
    val NID_7056 = "spec:width=600,height=1024,unit=px,dpi=160"

}
