package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Stgtelecom device specifications for Android Compose previews.
 *
 * This extension provides Stgtelecom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Stgtelecom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Stgtelecom get() = object {
    /** Stgtelecom STG_A1 */
    val STG_A1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Stgtelecom STG A1 Pro */
    val STG_A1_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Stgtelecom STG A2 Pro */
    val STG_A2_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Stgtelecom STG_B10 */
    val STG_B10 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Stgtelecom STG_C10 */
    val STG_C10 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Stgtelecom STG H10 */
    val STG_H10 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Stgtelecom STG_K10  */
    val STG_K10 = "spec:width=720,height=1560,unit=px,dpi=360"

    /** Stgtelecom STG-KeyTab */
    val STG_KEYTAB = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Stgtelecom STG_P10 */
    val STG_P10 = "spec:width=480,height=1014,unit=px,dpi=220"

    /** Stgtelecom STG_S1 */
    val STG_S1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Stgtelecom STG S10 */
    val STG_S10 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Stgtelecom STG_S20 */
    val STG_S20 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Stgtelecom STG_S30 */
    val STG_S30 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Stgtelecom STG_X1 */
    val STG_X1 = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Stgtelecom STG X2 */
    val STG_X2 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Stgtelecom STG X20 */
    val STG_X20 = "spec:width=1080,height=2310,unit=px,dpi=480"

    /** Stgtelecom STG X3 */
    val STG_X3 = "spec:width=720,height=1600,unit=px,dpi=320"

}
