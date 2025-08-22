package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Doro device specifications for Android Compose previews.
 *
 * This extension provides Doro device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Doro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Doro get() = object {
    /** Doro 8020x */
    val _8020X = "spec:width=480,height=854,unit=px,dpi=240"

    /** Doro Doro 8031 */
    val DORO_8031 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Doro Doro 8035 */
    val DORO_8035 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Doro Doro 8040 */
    val DORO_8040 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Doro Doro 8042 */
    val DORO_8042 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Doro Doro 8100 */
    val DORO_8100 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Doro Doro 8200 */
    val DORO_8200 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Doro Doro 824 */
    val DORO_824 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Doro Doro Aurora A10 */
    val DORO_AURORA_A10 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Doro Doro Aurora A20 */
    val DORO_AURORA_A20 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Doro Doro Aurora A30 */
    val DORO_AURORA_A30 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Doro Doro Tablet */
    val DORO_TABLET = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Doro DSB-0220 */
    val DSB_0220 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Doro DSB-0230 */
    val DSB_0230 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Doro Liberto 820 */
    val LIBERTO_820 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Doro Liberto 820 Mini */
    val LIBERTO_820_MINI = "spec:width=480,height=800,unit=px,dpi=240"

    /** Doro Liberto 822 / 8030 */
    val LIBERTO_822_8030 = "spec:width=480,height=854,unit=px,dpi=240"

}
