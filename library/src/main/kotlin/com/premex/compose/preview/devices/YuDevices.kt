package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Yu device specifications for Android Compose previews.
 *
 * This extension provides Yu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Yu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Yu get() = object {
    /** Yu YUNICORN */
    val YUNICORN = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Yu YUNIQUE */
    val YUNIQUE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Yu Yunique 2 */
    val YUNIQUE_2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Yu YUREKA */
    val YUREKA = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Yu Yureka Black */
    val YUREKA_BLACK = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Yu Yureka Note */
    val YUREKA_NOTE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Yu YUREKAS */
    val YUREKAS = "spec:width=1080,height=1920,unit=px,dpi=480"

}
