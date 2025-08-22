package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Wishtel device specifications for Android Compose previews.
 *
 * This extension provides Wishtel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Wishtel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Wishtel get() = object {
    /** Wishtel IRA */
    val IRA = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Wishtel IRA07 */
    val IRA07 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Wishtel IRA102017I */
    val IRA102017I = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Wishtel IRA_DUO */
    val IRA_DUO = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Wishtel IRAJ2 */
    val IRAJ2 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Wishtel IRA_S1 */
    val IRA_S1 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Wishtel IRAW7258 */
    val IRAW7258 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Wishtel IRAW801 */
    val IRAW801 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Wishtel IRAW801I */
    val IRAW801I = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Wishtel T811 */
    val T811 = "spec:width=1200,height=1920,unit=px,dpi=360"

}
