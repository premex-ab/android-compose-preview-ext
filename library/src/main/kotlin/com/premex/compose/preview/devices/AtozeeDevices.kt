package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Atozee device specifications for Android Compose previews.
 *
 * This extension provides Atozee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Atozee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Atozee get() = object {
    /** Atozee A30MAX */
    val A30MAX = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Atozee AT10K */
    val AT10K = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Atozee AT11K */
    val AT11K = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Atozee AT12K */
    val AT12K = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Atozee AT70K */
    val AT70K = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Atozee AT71K */
    val AT71K = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Atozee AT81K */
    val AT81K = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Atozee CP10S */
    val CP10S = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Atozee CP20_GOLD */
    val CP20_GOLD = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Atozee  CP20_MAX  */
    val CP20_MAX = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Atozee CP20_PRO */
    val CP20_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Atozee CP20S */
    val CP20S = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Atozee CP30 */
    val CP30 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Atozee CP31 */
    val CP31 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Atozee CP80 */
    val CP80 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Atozee CP80KS */
    val CP80KS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Atozee CP81 */
    val CP81 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Atozee NV10S */
    val NV10S = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Atozee P12 */
    val P12 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Atozee P70W */
    val P70W = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Atozee P80W */
    val P80W = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Atozee P81W */
    val P81W = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Atozee Q2S */
    val Q2S = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Atozee Q2SK */
    val Q2SK = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Atozee T30MAX */
    val T30MAX = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Atozee T30MAX_EEA */
    val T30MAX_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Atozee YQ10S_Gold */
    val YQ10S_GOLD = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Atozee YQ10SK */
    val YQ10SK = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Atozee YQ10S_MAX */
    val YQ10S_MAX = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Atozee ZB10S */
    val ZB10S = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Atozee ZB11S */
    val ZB11S = "spec:width=800,height=1280,unit=px,dpi=160"

}
