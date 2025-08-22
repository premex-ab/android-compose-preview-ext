package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Advance device specifications for Android Compose previews.
 *
 * This extension provides Advance device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Advance.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Advance get() = object {
    /** Advance ADVANCE */
    val ADVANCE = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Advance HL9000 */
    val HL9000 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Advance NP6050 */
    val NP6050 = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Advance NP6070 */
    val NP6070 = "spec:width=1200,height=1920,unit=px,dpi=340"

    /** Advance Pr5650 */
    val PR5650 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Advance Pr5747 */
    val PR5747 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Advance PR5860 */
    val PR5860 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Advance Pr6146 */
    val PR6146 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Advance PR6149 */
    val PR6149 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Advance PR6152 */
    val PR6152 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Advance PR6152-ADV */
    val PR6152_ADV = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Advance Pr7547 */
    val PR7547 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Advance SP4702 */
    val SP4702 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Advance SP4703 */
    val SP4703 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Advance SP4872 */
    val SP4872 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Advance SP5702 */
    val SP5702 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Advance SP5705 */
    val SP5705 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Advance SP5712 */
    val SP5712 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Advance SP5713 */
    val SP5713 = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Advance Sp5730 */
    val SP5730 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Advance SP5732 */
    val SP5732 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Advance SP5736 */
    val SP5736 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Advance SP5760 */
    val SP5760 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Advance SP5775 */
    val SP5775 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Advance SP5776 */
    val SP5776 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Advance SP7248 */
    val SP7248 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Advance SP7348 */
    val SP7348 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Advance TR3947 */
    val TR3947 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Advance Tr4986 */
    val TR4986 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Advance TR5994 */
    val TR5994 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Advance TR5996 */
    val TR5996 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Advance TR6948 */
    val TR6948 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Advance TR7988 */
    val TR7988 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Advance TR7989 */
    val TR7989 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Advance TR7990 */
    val TR7990 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Advance TR7998 */
    val TR7998 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Advance TR8990 */
    val TR8990 = "spec:width=600,height=1024,unit=px,dpi=200"

}
