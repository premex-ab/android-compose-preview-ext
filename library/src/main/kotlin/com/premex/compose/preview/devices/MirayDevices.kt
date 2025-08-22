package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Miray device specifications for Android Compose previews.
 *
 * This extension provides Miray device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Miray.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Miray get() = object {
    /** Miray MIDM_F10 */
    val MIDM_F10 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Miray TM4G_1006 */
    val TM4G_1006 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Miray TM4G_806 */
    val TM4G_806 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Miray TPM4G_105 */
    val TPM4G_105 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Miray TPM4G_E108 */
    val TPM4G_E108 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Miray TPM4G_E108_A */
    val TPM4G_E108_A = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Miray TPM4G_E9863 */
    val TPM4G_E9863 = "spec:width=800,height=1280,unit=px,dpi=213"

}
