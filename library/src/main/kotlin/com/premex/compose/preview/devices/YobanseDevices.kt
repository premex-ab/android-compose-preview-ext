package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Yobanse device specifications for Android Compose previews.
 *
 * This extension provides Yobanse device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Yobanse.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Yobanse get() = object {
    /** Yobanse T88 */
    val T88 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Yobanse Y101 */
    val Y101 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Yobanse Z-T10 */
    val Z_T10 = "spec:width=800,height=1280,unit=px,dpi=190"

    /** Yobanse Z-TAB10 */
    val Z_TAB10 = "spec:width=800,height=1280,unit=px,dpi=160"

}
