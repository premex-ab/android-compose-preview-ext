package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Plimpton device specifications for Android Compose previews.
 *
 * This extension provides Plimpton device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Plimpton.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Plimpton get() = object {
    /** Plimpton Kids_10 */
    val KIDS_10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Plimpton Kids_10_EEA */
    val KIDS_10_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Plimpton Kids_10_ver13 */
    val KIDS_10_VER13 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Plimpton Kids_10_ver14 */
    val KIDS_10_VER14 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Plimpton Kids_10_ver14_EEA */
    val KIDS_10_VER14_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Plimpton Kids20 */
    val KIDS20 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Plimpton Kids20A14 */
    val KIDS20A14 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Plimpton Kids20A14_EEA */
    val KIDS20A14_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Plimpton Kids20A15 */
    val KIDS20A15 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Plimpton Kids_8 */
    val KIDS_8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Plimpton P2 */
    val P2 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Plimpton P60Plus */
    val P60PLUS = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Plimpton P60Pro */
    val P60PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Plimpton P70_14 */
    val P70_14 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Plimpton P8 */
    val P8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Plimpton  P8Pro  */
    val P8PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Plimpton P8ProA14 */
    val P8PROA14 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Plimpton P8ProA14_EEA */
    val P8PROA14_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Plimpton PlimPad_P3 */
    val PLIMPAD_P3 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Plimpton PlimPad_P3_Pro */
    val PLIMPAD_P3_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Plimpton PlimPad_P60 */
    val PLIMPAD_P60 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Plimpton X100 */
    val X100 = "spec:width=1200,height=1920,unit=px,dpi=320"

}
