package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bmxc device specifications for Android Compose previews.
 *
 * This extension provides Bmxc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bmxc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bmxc get() = object {
    /** Bmxc BM108 */
    val BM108 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Bmxc JR-M802 */
    val JR_M802 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Bmxc K107 */
    val K107 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Bmxc K107_EEA */
    val K107_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Bmxc M107 */
    val M107 = "spec:width=800,height=1280,unit=px,dpi=210"

    /** Bmxc M863 */
    val M863 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Bmxc M863-EEA */
    val M863_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

}
