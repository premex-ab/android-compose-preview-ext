package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Maxwest device specifications for Android Compose previews.
 *
 * This extension provides Maxwest device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Maxwest.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Maxwest get() = object {
    /** Maxwest ASTRO_10_A */
    val ASTRO_10_A = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Maxwest ASTRO 10R */
    val ASTRO_10R = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Maxwest Astro 4 PRO */
    val ASTRO_4_PRO = "spec:width=480,height=800,unit=px,dpi=240"

    /** Maxwest Astro_55R */
    val ASTRO_55R = "spec:width=480,height=960,unit=px,dpi=240"

    /** Maxwest Astro 55T */
    val ASTRO_55T = "spec:width=480,height=960,unit=px,dpi=240"

    /** Maxwest Astro 5P */
    val ASTRO_5P = "spec:width=480,height=960,unit=px,dpi=240"

    /** Maxwest Astro 5 PRO */
    val ASTRO_5_PRO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Maxwest Astro 5T */
    val ASTRO_5T = "spec:width=480,height=854,unit=px,dpi=213"

    /** Maxwest  Astro_5X  */
    val ASTRO_5X = "spec:width=480,height=854,unit=px,dpi=213"

    /** Maxwest Astro 63R */
    val ASTRO_63R = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Maxwest ASTRO 6T */
    val ASTRO_6T = "spec:width=480,height=960,unit=px,dpi=213"

    /** Maxwest Astro 8Q */
    val ASTRO_8Q = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Maxwest Astro 8R */
    val ASTRO_8R = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Maxwest ASTRO_A63 */
    val ASTRO_A63 = "spec:width=480,height=1014,unit=px,dpi=220"

    /** Maxwest ASTRO A64 */
    val ASTRO_A64 = "spec:width=480,height=1014,unit=px,dpi=213"

    /** Maxwest ASTRO A65 */
    val ASTRO_A65 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Maxwest ASTRO A66 */
    val ASTRO_A66 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Maxwest Gravity_5_GO */
    val GRAVITY_5_GO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Maxwest Gravity_6P  */
    val GRAVITY_6P = "spec:width=720,height=1560,unit=px,dpi=240"

    /** Maxwest GRAVITY G6 */
    val GRAVITY_G6 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Maxwest GRAVITY_G64 */
    val GRAVITY_G64 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Maxwest GRAVITY_G65 */
    val GRAVITY_G65 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Maxwest MX-A4R */
    val MX_A4R = "spec:width=480,height=800,unit=px,dpi=220"

    /** Maxwest MX-N62 */
    val MX_N62 = "spec:width=720,height=1520,unit=px,dpi=280"

    /** Maxwest Nitro 4X */
    val NITRO_4X = "spec:width=480,height=800,unit=px,dpi=240"

    /** Maxwest Nitro 55A */
    val NITRO_55A = "spec:width=480,height=960,unit=px,dpi=240"

    /** Maxwest Nitro_55C */
    val NITRO_55C = "spec:width=480,height=960,unit=px,dpi=240"

    /** Maxwest Nitro 55E */
    val NITRO_55E = "spec:width=480,height=960,unit=px,dpi=240"

    /** Maxwest Nitro 55Q */
    val NITRO_55Q = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Maxwest Nitro_5C */
    val NITRO_5C = "spec:width=480,height=854,unit=px,dpi=213"

    /** Maxwest Nitro_5P */
    val NITRO_5P = "spec:width=480,height=854,unit=px,dpi=240"

    /** Maxwest  Nitro_7Q */
    val NITRO_7Q = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Maxwest Nitro_8 */
    val NITRO_8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Maxwest NITRO A65 */
    val NITRO_A65 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Maxwest NITRO G55 */
    val NITRO_G55 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Maxwest NITRO_G56 */
    val NITRO_G56 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Maxwest Panda_7 */
    val PANDA_7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Maxwest PANDA_KIDS_7 */
    val PANDA_KIDS_7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Maxwest TAB-9G */
    val TAB_9G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Maxwest TAB_MAX_7 */
    val TAB_MAX_7 = "spec:width=600,height=1024,unit=px,dpi=160"

}
