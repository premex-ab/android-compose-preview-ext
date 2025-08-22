package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lyf device specifications for Android Compose previews.
 *
 * This extension provides Lyf device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lyf.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lyf get() = object {
    /** Lyf LS-4006 */
    val LS_4006 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Lyf LS-4503 */
    val LS_4503 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lyf LS-4505 */
    val LS_4505 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lyf LS-4508 */
    val LS_4508 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lyf LS-5008 */
    val LS_5008 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lyf LS-5009 */
    val LS_5009 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lyf LS-5013 */
    val LS_5013 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lyf LS-5016 */
    val LS_5016 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lyf LS-5018 */
    val LS_5018 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lyf LS-5020 */
    val LS_5020 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lyf LS-5021 */
    val LS_5021 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Lyf LS-5201 */
    val LS_5201 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Lyf LS-5503 */
    val LS_5503 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lyf LS-5504  */
    val LS_5504 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Lyf LS-6001 */
    val LS_6001 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lyf LT-8001 */
    val LT_8001 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Lyf LT-8001 IRIS  */
    val LT_8001_IRIS = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Lyf WATER F1 */
    val WATER_F1 = "spec:width=1080,height=1920,unit=px,dpi=480"

}
