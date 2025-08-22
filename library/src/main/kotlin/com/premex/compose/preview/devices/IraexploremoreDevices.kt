package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Iraexploremore device specifications for Android Compose previews.
 *
 * This extension provides Iraexploremore device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Iraexploremore.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Iraexploremore get() = object {
    /** Iraexploremore IRA801 */
    val IRA801 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iraexploremore IRA_BIO */
    val IRA_BIO = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Iraexploremore IRA_DUO_PLUS */
    val IRA_DUO_PLUS = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Iraexploremore IRA_DUO_PRO_5G */
    val IRA_DUO_PRO_5G = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Iraexploremore IRA explore more */
    val IRA_EXPLORE_MORE = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Iraexploremore IRA_T1029 */
    val IRA_T1029 = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Iraexploremore IRAT803 */
    val IRAT803 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Iraexploremore IRA_W801 */
    val IRA_W801 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Iraexploremore T1021 */
    val T1021 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Iraexploremore T1030A */
    val T1030A = "spec:width=1200,height=2000,unit=px,dpi=340"

    /** Iraexploremore T803 */
    val T803 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Iraexploremore T808 */
    val T808 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Iraexploremore T808 */
    val T808_800X1280 = "spec:width=800,height=1280,unit=px,dpi=320"

}
