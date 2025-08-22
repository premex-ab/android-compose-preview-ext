package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Starkfuture device specifications for Android Compose previews.
 *
 * This extension provides Starkfuture device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Starkfuture.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Starkfuture get() = object {
    /** Starkfuture ARKENSTONE */
    val ARKENSTONE = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Starkfuture VARG */
    val VARG = "spec:width=720,height=1440,unit=px,dpi=320"

}
