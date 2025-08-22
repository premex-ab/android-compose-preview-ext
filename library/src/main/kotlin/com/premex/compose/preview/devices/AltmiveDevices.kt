package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Altmive device specifications for Android Compose previews.
 *
 * This extension provides Altmive device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Altmive.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Altmive get() = object {
    /** Altmive Kids Phone */
    val KIDS_PHONE = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Altmive Kids Phone 2 */
    val KIDS_PHONE_2 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Altmive Style Folder */
    val STYLE_FOLDER = "spec:width=480,height=800,unit=px,dpi=240"

    /** Altmive Style Folder 2 */
    val STYLE_FOLDER_2 = "spec:width=480,height=800,unit=px,dpi=220"

}
