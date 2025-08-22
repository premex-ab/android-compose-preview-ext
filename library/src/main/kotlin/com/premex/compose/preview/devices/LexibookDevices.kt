package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lexibook device specifications for Android Compose previews.
 *
 * This extension provides Lexibook device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lexibook.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lexibook get() = object {
    /** Lexibook LT10 */
    val LT10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Lexibook LT10_01_EEA */
    val LT10_01_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Lexibook LT10EN_09 */
    val LT10EN_09 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Lexibook MFC149 */
    val MFC149 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Lexibook Tablet Phone */
    val TABLET_PHONE = "spec:width=480,height=800,unit=px,dpi=240"

    /** Lexibook TL70 */
    val TL70 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Lexibook TLN10FR */
    val TLN10FR = "spec:width=800,height=1280,unit=px,dpi=213"

}
