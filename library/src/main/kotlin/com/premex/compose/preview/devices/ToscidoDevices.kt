package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Toscido device specifications for Android Compose previews.
 *
 * This extension provides Toscido device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Toscido.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Toscido get() = object {
    /** Toscido P101 */
    val P101 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Toscido P101-EEA */
    val P101_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Toscido T12-EEA */
    val T12_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Toscido T13-EEA */
    val T13_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Toscido T15 */
    val T15 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Toscido T151 */
    val T151 = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Toscido T151-EEA */
    val T151_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Toscido T181 */
    val T181 = "spec:width=1200,height=1920,unit=px,dpi=200"

    /** Toscido T181-EEA */
    val T181_EEA = "spec:width=1200,height=1920,unit=px,dpi=200"

    /** Toscido T201 */
    val T201 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Toscido T201-EEA */
    val T201_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Toscido T20-EEA */
    val T20_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Toscido T211-EEA */
    val T211_EEA = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Toscido T21-EEA */
    val T21_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Toscido T22 */
    val T22 = "spec:width=800,height=1280,unit=px,dpi=186"

    /** Toscido T221 */
    val T221 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Toscido T22-EEA */
    val T22_EEA = "spec:width=800,height=1280,unit=px,dpi=186"

    /** Toscido T26-EEA */
    val T26_EEA = "spec:width=1600,height=2176,unit=px,dpi=240"

    /** Toscido T28 */
    val T28 = "spec:width=800,height=1280,unit=px,dpi=212"

    /** Toscido T28-EEA */
    val T28_EEA = "spec:width=800,height=1280,unit=px,dpi=212"

    /** Toscido T32-EEA */
    val T32_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Toscido T50 */
    val T50 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Toscido T50-EEA */
    val T50_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Toscido X102 */
    val X102 = "spec:width=800,height=1280,unit=px,dpi=160"

}
