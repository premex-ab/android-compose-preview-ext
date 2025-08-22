package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Okapi device specifications for Android Compose previews.
 *
 * This extension provides Okapi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Okapi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Okapi get() = object {
    /** Okapi Okapi10 */
    val OKAPI10 = "spec:width=480,height=996,unit=px,dpi=213"

    /** Okapi Okapi10_Pro */
    val OKAPI10_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Okapi Okapi10_Pro_Max */
    val OKAPI10_PRO_MAX = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Okapi Okapi10_S */
    val OKAPI10_S = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Okapi Okapi_Tab8 */
    val OKAPI_TAB8 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Okapi Okapi_Tab8_Pro */
    val OKAPI_TAB8_PRO = "spec:width=800,height=1280,unit=px,dpi=240"

}
