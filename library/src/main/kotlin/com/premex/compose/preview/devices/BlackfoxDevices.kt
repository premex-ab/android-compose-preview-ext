package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Blackfox device specifications for Android Compose previews.
 *
 * This extension provides Blackfox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Blackfox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Blackfox get() = object {
    /** Blackfox BMM431B */
    val BMM431B = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Blackfox BMM431S */
    val BMM431S = "spec:width=720,height=1440,unit=px,dpi=300"

    /** Blackfox BMM441A */
    val BMM441A = "spec:width=720,height=1520,unit=px,dpi=300"

    /** Blackfox BMM441B */
    val BMM441B = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Blackfox BMM441S  */
    val BMM441S = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Blackfox BMM531A */
    val BMM531A = "spec:width=480,height=960,unit=px,dpi=240"

    /** Blackfox BMM531D */
    val BMM531D = "spec:width=480,height=960,unit=px,dpi=240"

    /** Blackfox BMM531S */
    val BMM531S = "spec:width=720,height=1440,unit=px,dpi=300"

    /** Blackfox BMM532D */
    val BMM532D = "spec:width=720,height=1440,unit=px,dpi=300"

    /** Blackfox BMM541W */
    val BMM541W = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blackfox BMM543S */
    val BMM543S = "spec:width=480,height=960,unit=px,dpi=240"

}
