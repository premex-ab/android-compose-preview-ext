package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Disneypixar device specifications for Android Compose previews.
 *
 * This extension provides Disneypixar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Disneypixar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Disneypixar get() = object {
    /** Disneypixar Toy_story */
    val TOY_STORY = "spec:width=600,height=1024,unit=px,dpi=160"

}
