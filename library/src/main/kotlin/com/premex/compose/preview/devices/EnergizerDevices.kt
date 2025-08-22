package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Energizer device specifications for Android Compose previews.
 *
 * This extension provides Energizer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Energizer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Energizer get() = object {
    /** Energizer EnergyE500 */
    val ENERGYE500 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Energizer EnergyE500S_EU */
    val ENERGYE500S_EU = "spec:width=480,height=854,unit=px,dpi=240"

    /** Energizer H550S */
    val H550S = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Energizer HARDCASEH500S */
    val HARDCASEH500S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Energizer Hardcase H620S */
    val HARDCASE_H620S = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Energizer PowerMaxP490 */
    val POWERMAXP490 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Energizer PowerMaxP490S_AP */
    val POWERMAXP490S_AP = "spec:width=480,height=960,unit=px,dpi=240"

    /** Energizer PowerMaxP490S_EU */
    val POWERMAXP490S_EU = "spec:width=480,height=960,unit=px,dpi=240"

    /** Energizer PowerMaxP550S */
    val POWERMAXP550S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Energizer PowerMaxP600S */
    val POWERMAXP600S = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Energizer S550 */
    val S550 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Energizer U505S */
    val U505S = "spec:width=480,height=854,unit=px,dpi=200"

    /** Energizer U506S */
    val U506S = "spec:width=480,height=854,unit=px,dpi=200"

    /** Energizer U608S */
    val U608S = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Energizer U652S */
    val U652S = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Energizer Ultimate U710S */
    val ULTIMATE_U710S = "spec:width=1080,height=2244,unit=px,dpi=480"

}
