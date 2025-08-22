package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Esienterprises device specifications for Android Compose previews.
 *
 * This extension provides Esienterprises device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Esienterprises.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Esienterprises get() = object {
    /** Esienterprises EPIK Learning Tab 8'' */
    val EPIK_LEARNING_TAB_8 = "spec:width=800,height=1280,unit=px,dpi=213"

}
