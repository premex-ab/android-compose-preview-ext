package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Stksantok device specifications for Android Compose previews.
 *
 * This extension provides Stksantok device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Stksantok.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Stksantok get() = object {
    /** Stksantok cayenne */
    val CAYENNE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Stksantok Evo_2 */
    val EVO_2 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Stksantok STK X2 */
    val STK_X2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Stksantok Sync 5e */
    val SYNC_5E = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Stksantok Transporter 1 */
    val TRANSPORTER_1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Stksantok X3 */
    val X3 = "spec:width=720,height=1600,unit=px,dpi=320"

}
