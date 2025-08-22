package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vikusha device specifications for Android Compose previews.
 *
 * This extension provides Vikusha device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vikusha.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vikusha get() = object {
    /** Vikusha V-E5 */
    val V_E5 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vikusha V-N5 */
    val V_N5 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Vikusha VZ-30 */
    val VZ_30 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vikusha VZ-30Pro */
    val VZ_30PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vikusha V-Z40 */
    val V_Z40 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Vikusha V-Z40Pro */
    val V_Z40PRO = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Vikusha V-Z70 */
    val V_Z70 = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Vikusha V-Z80Plus */
    val V_Z80PLUS = "spec:width=1200,height=2000,unit=px,dpi=252"

}
