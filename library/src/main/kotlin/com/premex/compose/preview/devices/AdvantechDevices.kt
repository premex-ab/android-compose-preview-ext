package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Advantech device specifications for Android Compose previews.
 *
 * This extension provides Advantech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Advantech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Advantech get() = object {
    /** Advantech AIM-75 */
    val AIM_75 = "spec:width=1200,height=1920,unit=px,dpi=420"

    /** Advantech AIM75-WIFI */
    val AIM75_WIFI = "spec:width=1200,height=1920,unit=px,dpi=420"

}
