package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Umxultimatemobileexperience device specifications for Android Compose previews.
 *
 * This extension provides Umxultimatemobileexperience device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Umxultimatemobileexperience.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Umxultimatemobileexperience get() = object {
    /** Umxultimatemobileexperience U2-PLUS-TE-VR */
    val U2_PLUS_TE_VR = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Umxultimatemobileexperience U2VR */
    val U2VR = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Umxultimatemobileexperience U3AR */
    val U3AR = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Umxultimatemobileexperience U504TL */
    val U504TL = "spec:width=480,height=854,unit=px,dpi=240"

    /** Umxultimatemobileexperience U673C */
    val U673C = "spec:width=480,height=800,unit=px,dpi=240"

    /** Umxultimatemobileexperience U683CL */
    val U683CL = "spec:width=480,height=854,unit=px,dpi=240"

    /** Umxultimatemobileexperience U693CL */
    val U693CL = "spec:width=480,height=854,unit=px,dpi=240"

    /** Umxultimatemobileexperience U696CL */
    val U696CL = "spec:width=720,height=1560,unit=px,dpi=320"

}
