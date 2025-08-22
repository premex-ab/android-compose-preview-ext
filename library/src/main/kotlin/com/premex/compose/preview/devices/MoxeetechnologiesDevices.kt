package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Moxeetechnologies device specifications for Android Compose previews.
 *
 * This extension provides Moxeetechnologies device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Moxeetechnologies.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Moxeetechnologies get() = object {
    /** Moxeetechnologies m2307 */
    val M2307 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Moxeetechnologies MH-T6000 */
    val MH_T6000 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Moxeetechnologies Moxee_T2310 */
    val MOXEE_T2310 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Moxeetechnologies MT-T800 */
    val MT_T800 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Moxeetechnologies MT-T8B22 */
    val MT_T8B22 = "spec:width=800,height=1280,unit=px,dpi=320"

}
