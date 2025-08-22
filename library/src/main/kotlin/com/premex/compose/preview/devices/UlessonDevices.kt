package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ulesson device specifications for Android Compose previews.
 *
 * This extension provides Ulesson device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ulesson.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ulesson get() = object {
    /** Ulesson uLesson_Education_Tab */
    val ULESSON_EDUCATION_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ulesson uLesson_Education_Tab_V2 */
    val ULESSON_EDUCATION_TAB_V2 = "spec:width=800,height=1280,unit=px,dpi=213"

}
