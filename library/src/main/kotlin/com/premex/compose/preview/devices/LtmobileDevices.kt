package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ltmobile device specifications for Android Compose previews.
 *
 * This extension provides Ltmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ltmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ltmobile get() = object {
    /** Ltmobile LT 2003 */
    val LT_2003 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ltmobile LT_6217 */
    val LT_6217 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ltmobile LT_6509 */
    val LT_6509 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ltmobile LT_8103 */
    val LT_8103 = "spec:width=720,height=1604,unit=px,dpi=320"

    /** Ltmobile LT_8501 */
    val LT_8501 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ltmobile LT_9701 */
    val LT_9701 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Ltmobile LT_9902 */
    val LT_9902 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Ltmobile LT_9906 */
    val LT_9906 = "spec:width=1080,height=2560,unit=px,dpi=480"

    /** Ltmobile LT-E6707 */
    val LT_E6707 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Ltmobile LT_mobile_C26 */
    val LT_MOBILE_C26 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Ltmobile LT_mobile_C60 */
    val LT_MOBILE_C60 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ltmobile LT_mobile_E16 */
    val LT_MOBILE_E16 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ltmobile LT_mobile_E18 */
    val LT_MOBILE_E18 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ltmobile LT_mobile_S22 */
    val LT_MOBILE_S22 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ltmobile LT_mobile_S33 */
    val LT_MOBILE_S33 = "spec:width=1080,height=2460,unit=px,dpi=480"

}
