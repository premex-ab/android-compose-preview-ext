package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Myphonepl device specifications for Android Compose previews.
 *
 * This extension provides Myphonepl device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Myphonepl.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Myphonepl get() = object {
    /** Myphonepl Fun_LTE */
    val FUN_LTE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Myphonepl Hammer_Active */
    val HAMMER_ACTIVE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Myphonepl Hammer AXE PRO */
    val HAMMER_AXE_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Myphonepl Hammer Blade 2 Pro */
    val HAMMER_BLADE_2_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Myphonepl Hammer_Energy_3G */
    val HAMMER_ENERGY_3G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Myphonepl Hammer_Explorer */
    val HAMMER_EXPLORER = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Myphonepl Hammer_Iron_2 */
    val HAMMER_IRON_2 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Myphonepl Hammer IRON 3 LTE */
    val HAMMER_IRON_3_LTE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Myphonepl Hykker MyTab10 */
    val HYKKER_MYTAB10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Myphonepl myPhone City */
    val MYPHONE_CITY = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Myphonepl myPhone_City_2 */
    val MYPHONE_CITY_2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Myphonepl myPhone Fun 6 */
    val MYPHONE_FUN_6 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Myphonepl myPhone Fun 9 */
    val MYPHONE_FUN_9 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Myphonepl myPhone HAMMER ENERGY */
    val MYPHONE_HAMMER_ENERGY = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Myphonepl myPhone_Prime_2 */
    val MYPHONE_PRIME_2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Myphonepl myPhone Prime 3 */
    val MYPHONE_PRIME_3 = "spec:width=480,height=996,unit=px,dpi=240"

    /** Myphonepl Pocket_Pro */
    val POCKET_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Myphonepl Prime 4 Lite */
    val PRIME_4_LITE = "spec:width=480,height=960,unit=px,dpi=240"

}
