package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kinstone device specifications for Android Compose previews.
 *
 * This extension provides Kinstone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kinstone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kinstone get() = object {
    /** Kinstone CON_102 */
    val CON_102 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Kinstone KST102SA-EEA */
    val KST102SA_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Kinstone KST102SF */
    val KST102SF = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Kinstone KST102SF_EA */
    val KST102SF_EA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Kinstone KST103RC */
    val KST103RC = "spec:width=1200,height=1920,unit=px,dpi=288"

    /** Kinstone KST103SD */
    val KST103SD = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Kinstone KST103SD_J */
    val KST103SD_J = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Kinstone KST103SD-L */
    val KST103SD_L = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Kinstone SA070 */
    val SA070 = "spec:width=600,height=1024,unit=px,dpi=213"

}
