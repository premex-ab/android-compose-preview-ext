package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Aceglobal device specifications for Android Compose previews.
 *
 * This extension provides Aceglobal device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Aceglobal.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Aceglobal get() = object {
    /** Aceglobal AS0124 */
    val AS0124 = "spec:width=576,height=1280,unit=px,dpi=213"

    /** Aceglobal AS0224 */
    val AS0224 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Aceglobal AS0324 */
    val AS0324 = "spec:width=720,height=1650,unit=px,dpi=320"

    /** Aceglobal AS0623 */
    val AS0623 = "spec:width=720,height=1650,unit=px,dpi=320"

    /** Aceglobal BUZZ 3  */
    val BUZZ_3 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Aceglobal BUZZ 3 Plus */
    val BUZZ_3_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Aceglobal BUZZ 4 */
    val BUZZ_4 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Aceglobal BUZZ 4 Prime */
    val BUZZ_4_PRIME = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Aceglobal BUZZ 4 Ultra */
    val BUZZ_4_ULTRA = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Aceglobal BUZZ 5 Ultra */
    val BUZZ_5_ULTRA = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Aceglobal BUZZ 6 Flip */
    val BUZZ_6_FLIP = "spec:width=1080,height=2560,unit=px,dpi=480"

    /** Aceglobal BUZZ 6 Prime */
    val BUZZ_6_PRIME = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Aceglobal BUZZ 6 Prime PLUS */
    val BUZZ_6_PRIME_PLUS = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Aceglobal BUZZ 6 Pro PLUS */
    val BUZZ_6_PRO_PLUS = "spec:width=720,height=1604,unit=px,dpi=320"

    /** Aceglobal BUZZ 6 Ultra */
    val BUZZ_6_ULTRA = "spec:width=720,height=1604,unit=px,dpi=320"

    /** Aceglobal BUZZ 7 Lite */
    val BUZZ_7_LITE = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Aceglobal BUZZ 7 Pro */
    val BUZZ_7_PRO = "spec:width=720,height=1604,unit=px,dpi=320"

    /** Aceglobal BUZZ 7 Ultra */
    val BUZZ_7_ULTRA = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Aceglobal CLEVER 3 */
    val CLEVER_3 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Aceglobal URBAN 3 */
    val URBAN_3 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Aceglobal URBAN 3 Plus */
    val URBAN_3_PLUS = "spec:width=720,height=1640,unit=px,dpi=320"

}
