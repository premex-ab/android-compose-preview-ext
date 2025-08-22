package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hammer device specifications for Android Compose previews.
 *
 * This extension provides Hammer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hammer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hammer get() = object {
    /** Hammer Hammer Blade 3 */
    val HAMMER_BLADE_3 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Hammer Hammer Blade 4 */
    val HAMMER_BLADE_4 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Hammer Hammer Blade 5G */
    val HAMMER_BLADE_5G = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Hammer Hammer Blade Va 5G EEA */
    val HAMMER_BLADE_VA_5G_EEA = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Hammer Hammer Construction */
    val HAMMER_CONSTRUCTION = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Hammer Hammer_Construction_2_5G_EEA */
    val HAMMER_CONSTRUCTION_2_5G_EEA = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Hammer Hammer_Construction_2_Thermal_5G_EEA */
    val HAMMER_CONSTRUCTION_2_THERMAL_5G_EEA = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Hammer Hammer Energy 2 2022 */
    val HAMMER_ENERGY_2_2022 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Hammer Hammer Explorer Plus */
    val HAMMER_EXPLORER_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Hammer Hammer Explorer Pro */
    val HAMMER_EXPLORER_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Hammer Hammer_Iron_6 */
    val HAMMER_IRON_6 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Hammer Hammer_Iron_Va_EEA */
    val HAMMER_IRON_VA_EEA = "spec:width=720,height=1612,unit=px,dpi=320"

}
