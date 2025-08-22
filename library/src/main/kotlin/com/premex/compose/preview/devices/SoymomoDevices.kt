package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Soymomo device specifications for Android Compose previews.
 *
 * This extension provides Soymomo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Soymomo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Soymomo get() = object {
    /** Soymomo SoyMomo_Lite_V1_EEA */
    val SOYMOMO_LITE_V1_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Soymomo SoyMomo_Lite_V3 */
    val SOYMOMO_LITE_V3 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Soymomo SoyMomo_Pro_EU_V1 */
    val SOYMOMO_PRO_EU_V1 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Soymomo SoyMomo_Pro_V1 */
    val SOYMOMO_PRO_V1 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Soymomo SoyMomo_Pro_V2 */
    val SOYMOMO_PRO_V2 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Soymomo SoyMomo_Pro_V2_24 */
    val SOYMOMO_PRO_V2_24 = "spec:width=800,height=1280,unit=px,dpi=213"

}
