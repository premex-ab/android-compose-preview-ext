package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Danew device specifications for Android Compose previews.
 *
 * This extension provides Danew device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Danew.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Danew get() = object {
    /** Danew D809ProPlus */
    val D809PROPLUS = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Danew Dbook_110_EEA */
    val DBOOK_110_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Danew Dbook_111 */
    val DBOOK_111 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Danew Dbook112_EEA */
    val DBOOK112_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Danew Dslide 1013QC */
    val DSLIDE_1013QC = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Danew Dslide1013QC_V4 */
    val DSLIDE1013QC_V4 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Danew Dslide1016_V2_EEA */
    val DSLIDE1016_V2_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Danew Dslide1019 */
    val DSLIDE1019 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Danew Dslide_1020 */
    val DSLIDE_1020 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Danew Dslide_1020M */
    val DSLIDE_1020M = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Danew Dslide_1020Pro_EEA */
    val DSLIDE_1020PRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Danew  Dslide_1021C */
    val DSLIDE_1021C = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Danew Dslide_1021_EEA */
    val DSLIDE_1021_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Danew Dslide_1095_EEA */
    val DSLIDE_1095_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Danew Dslide_113 */
    val DSLIDE_113 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Danew Dslide_114 */
    val DSLIDE_114 = "spec:width=1200,height=1920,unit=px,dpi=200"

    /** Danew Dslide_115_EEA */
    val DSLIDE_115_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Danew Dslide716 */
    val DSLIDE716 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Danew Dslide807 */
    val DSLIDE807 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Danew Dslide808 */
    val DSLIDE808 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Danew Dslide_809 */
    val DSLIDE_809 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Danew Dslide_809Pro_EEA */
    val DSLIDE_809PRO_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Danew G27 */
    val G27 = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Danew Konnect 402 */
    val KONNECT_402 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Danew Konnect_508 */
    val KONNECT_508 = "spec:width=480,height=854,unit=px,dpi=213"

    /** Danew Konnect_509 */
    val KONNECT_509 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Danew Konnect 556 */
    val KONNECT_556 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Danew Konnect_557 */
    val KONNECT_557 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Danew konnect 601 */
    val KONNECT_601 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Danew Konnect 602 */
    val KONNECT_602 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Danew Konnect_607 */
    val KONNECT_607 = "spec:width=600,height=1280,unit=px,dpi=320"

    /** Danew Konnect_608 */
    val KONNECT_608 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Danew TRACE ONE */
    val TRACE_ONE = "spec:width=720,height=1440,unit=px,dpi=320"

}
