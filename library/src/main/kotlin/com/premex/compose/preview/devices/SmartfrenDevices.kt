package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Smartfren device specifications for Android Compose previews.
 *
 * This extension provides Smartfren device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Smartfren.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Smartfren get() = object {
    /** Smartfren A16C3H */
    val A16C3H = "spec:width=480,height=854,unit=px,dpi=240"

    /** Smartfren A26C4H */
    val A26C4H = "spec:width=480,height=854,unit=px,dpi=240"

    /** Smartfren B16C2G */
    val B16C2G = "spec:width=480,height=854,unit=px,dpi=240"

    /** Smartfren B16C2H */
    val B16C2H = "spec:width=480,height=854,unit=px,dpi=240"

    /** Smartfren B26D2H */
    val B26D2H = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Smartfren G36C1G */
    val G36C1G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Smartfren G36C1H */
    val G36C1H = "spec:width=480,height=854,unit=px,dpi=240"

}
