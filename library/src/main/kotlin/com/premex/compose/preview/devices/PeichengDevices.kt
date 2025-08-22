package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Peicheng device specifications for Android Compose previews.
 *
 * This extension provides Peicheng device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Peicheng.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Peicheng get() = object {
    /** Peicheng Q1 */
    val Q1 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Peicheng Q8 */
    val Q8 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Peicheng Q8PRO */
    val Q8PRO = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Peicheng ZB31 */
    val ZB31 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Peicheng ZB32 */
    val ZB32 = "spec:width=800,height=1280,unit=px,dpi=160"

}
