package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Terra device specifications for Android Compose previews.
 *
 * This extension provides Terra device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Terra.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Terra get() = object {
    /** Terra GPAD702 */
    val GPAD702 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Terra TERRA_MOBILE_PAD_1200 */
    val TERRA_MOBILE_PAD_1200 = "spec:width=1280,height=1920,unit=px,dpi=240"

    /** Terra TERRA_PAD_1005 */
    val TERRA_PAD_1005 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Terra TERRA_PAD_1005POKO */
    val TERRA_PAD_1005POKO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Terra TERRA_PAD_1006 */
    val TERRA_PAD_1006 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Terra TERRA_PAD_1006_V2 */
    val TERRA_PAD_1006_V2 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Terra TERRA_PAD_1007 */
    val TERRA_PAD_1007 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Terra TERRA_PAD_1200_V2 */
    val TERRA_PAD_1200_V2 = "spec:width=1280,height=1920,unit=px,dpi=240"

    /** Terra TERRA_PAD_1201 */
    val TERRA_PAD_1201 = "spec:width=1600,height=2560,unit=px,dpi=320"

}
