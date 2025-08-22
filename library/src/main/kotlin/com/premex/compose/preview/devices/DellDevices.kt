package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dell device specifications for Android Compose previews.
 *
 * This extension provides Dell device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dell get() = object {
    /** Dell Venue 10 */
    val VENUE_10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dell Venue 7 */
    val VENUE_7 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dell Venue 7040 */
    val VENUE_7040 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Dell Venue 8 */
    val VENUE_8 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Dell Venue 8 */
    val VENUE_8_1600X2560 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Dell Venue 8 */
    val VENUE_8_800X1280 = "spec:width=800,height=1280,unit=px,dpi=213"

}
