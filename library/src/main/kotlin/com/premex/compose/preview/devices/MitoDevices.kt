package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mito device specifications for Android Compose previews.
 *
 * This extension provides Mito device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mito.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mito get() = object {
    /** Mito A67 */
    val A67 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Mito MITO A17 */
    val MITO_A17 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Mito MITO_A19_1GB */
    val MITO_A19_1GB = "spec:width=480,height=854,unit=px,dpi=213"

    /** Mito MITO_A19_2GB */
    val MITO_A19_2GB = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Mito MITO A21 */
    val MITO_A21 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Mito Mito_A35 */
    val MITO_A35 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Mito Mito_A36_W1 */
    val MITO_A36_W1 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Mito Mito_A37_Z1 */
    val MITO_A37_Z1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Mito Mito_A37_Z1 */
    val MITO_A37_Z1_720X1600 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Mito  MITO_T7 */
    val MITO_T7 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mito MITO T85 */
    val MITO_T85 = "spec:width=1080,height=2220,unit=px,dpi=440"

    /** Mito T5091A */
    val T5091A = "spec:width=480,height=960,unit=px,dpi=240"

    /** Mito T8 */
    val T8 = "spec:width=600,height=1024,unit=px,dpi=213"

}
