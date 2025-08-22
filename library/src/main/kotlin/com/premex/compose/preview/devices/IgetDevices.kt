package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Iget device specifications for Android Compose previews.
 *
 * This extension provides Iget device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Iget.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Iget get() = object {
    /** Iget SMART_G101 */
    val SMART_G101 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iget SMART_G102 */
    val SMART_G102 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iget SMART_G81 */
    val SMART_G81 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iget SMART_G81H */
    val SMART_G81H = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iget SMART_L102 */
    val SMART_L102 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iget SMART_L103_eea */
    val SMART_L103_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iget SMART_L104_eea */
    val SMART_L104_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iget SMART_L11 */
    val SMART_L11 = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Iget SMART_L206 */
    val SMART_L206 = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Iget SMART_L20X */
    val SMART_L20X = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Iget SMART_L30 */
    val SMART_L30 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Iget SMART_L31 */
    val SMART_L31 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Iget SMART_L32 */
    val SMART_L32 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Iget SMART_W101 */
    val SMART_W101 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iget SMART_W10X_EEA  */
    val SMART_W10X_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iget SMART_W202 */
    val SMART_W202 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iget SMART_W203 */
    val SMART_W203 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iget SMART_W20X */
    val SMART_W20X = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iget SMART_W30_EEA */
    val SMART_W30_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Iget SMART_W31_EEA */
    val SMART_W31_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Iget SMART_W32 */
    val SMART_W32 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Iget SMART_W84_EEA */
    val SMART_W84_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Iget SMART_W8_Kids */
    val SMART_W8_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Iget SMART_W8X */
    val SMART_W8X = "spec:width=800,height=1280,unit=px,dpi=213"

}
