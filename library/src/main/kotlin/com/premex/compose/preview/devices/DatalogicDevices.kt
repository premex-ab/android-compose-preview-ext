package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Datalogic device specifications for Android Compose previews.
 *
 * This extension provides Datalogic device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Datalogic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Datalogic get() = object {
    /** Datalogic Datalogic MEMOR 10 */
    val DATALOGIC_MEMOR_10 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Datalogic MEMOR 1 */
    val MEMOR_1 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Datalogic MEMOR 11 */
    val MEMOR_11 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Datalogic Memor 12 */
    val MEMOR_12 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Datalogic Memor 20 */
    val MEMOR_20 = "spec:width=1080,height=2160,unit=px,dpi=440"

    /** Datalogic Memor 35/35X */
    val MEMOR_35_35X = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Datalogic Skorpio X5 */
    val SKORPIO_X5 = "spec:width=480,height=800,unit=px,dpi=240"

}
