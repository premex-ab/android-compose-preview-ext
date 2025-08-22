package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Spark device specifications for Android Compose previews.
 *
 * This extension provides Spark device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Spark.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Spark get() = object {
    /** Spark Spark_Plus_3 */
    val SPARK_PLUS_3 = "spec:width=480,height=960,unit=px,dpi=240"

}
