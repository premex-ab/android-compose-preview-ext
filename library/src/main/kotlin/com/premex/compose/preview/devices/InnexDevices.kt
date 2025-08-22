package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Innex device specifications for Android Compose previews.
 *
 * This extension provides Innex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Innex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Innex get() = object {
    /** Innex Meeting_hub_EU */
    val MEETING_HUB_EU = "spec:width=2160,height=3840,unit=px,dpi=420"

}
