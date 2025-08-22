package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Onelern device specifications for Android Compose previews.
 *
 * This extension provides Onelern device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Onelern.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Onelern get() = object {
    /** Onelern OneLernDB009 */
    val ONELERNDB009 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Onelern OneLernDB010 */
    val ONELERNDB010 = "spec:width=800,height=1280,unit=px,dpi=160"

}
