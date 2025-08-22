package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hannspree device specifications for Android Compose previews.
 *
 * This extension provides Hannspree device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hannspree.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hannspree get() = object {
    /** Hannspree HannspadPro */
    val HANNSPADPRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hannspree HSD0001 */
    val HSD0001 = "spec:width=1200,height=1600,unit=px,dpi=213"

    /** Hannspree HSG1341 */
    val HSG1341 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hannspree HSG1351 */
    val HSG1351 = "spec:width=1080,height=1920,unit=px,dpi=160"

    /** Hannspree HSG1351 */
    val HSG1351_1080X1920 = "spec:width=1080,height=1920,unit=px,dpi=213"

    /** Hannspree HSG1376 */
    val HSG1376 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hannspree HSG1415 */
    val HSG1415 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hannspree HSG1416 */
    val HSG1416 = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Hannspree  Product Name HSG1416A */
    val PRODUCT_NAME_HSG1416A = "spec:width=1080,height=1920,unit=px,dpi=240"

}
