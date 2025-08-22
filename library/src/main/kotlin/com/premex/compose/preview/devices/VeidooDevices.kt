package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Veidoo device specifications for Android Compose previews.
 *
 * This extension provides Veidoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Veidoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Veidoo get() = object {
    /** Veidoo T12 */
    val T12 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Veidoo T20 */
    val T20 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Veidoo T20_Play_EEA */
    val T20_PLAY_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Veidoo T20-Plus */
    val T20_PLUS = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Veidoo T30_EEA */
    val T30_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Veidoo T30_PLUS */
    val T30_PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Veidoo T30_Plus_EEA */
    val T30_PLUS_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Veidoo T7S */
    val T7S = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Veidoo T80 */
    val T80 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Veidoo T80_PLUS */
    val T80_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Veidoo V88 */
    val V88 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Veidoo VeidooT30_EEA */
    val VEIDOOT30_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Veidoo VEIDOO_T30_PLUS	 */
    val VEIDOO_T30_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Veidoo VEIDOO_T40 */
    val VEIDOO_T40 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Veidoo VEIDOO_T40_EEA */
    val VEIDOO_T40_EEA = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Veidoo VEIDOO_T50 */
    val VEIDOO_T50 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Veidoo VEIDOO_T60_PLUS */
    val VEIDOO_T60_PLUS = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Veidoo VEIDOO_T70 */
    val VEIDOO_T70 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Veidoo VEIDOO_T70_PLUS */
    val VEIDOO_T70_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Veidoo VEIDOO_T8 */
    val VEIDOO_T8 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Veidoo VEIDOO_T80 */
    val VEIDOO_T80 = "spec:width=600,height=1024,unit=px,dpi=160"

}
