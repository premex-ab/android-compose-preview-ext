package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hyundaimaestro device specifications for Android Compose previews.
 *
 * This extension provides Hyundaimaestro device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hyundaimaestro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hyundaimaestro get() = object {
    /** Hyundaimaestro HDT_1064GS */
    val HDT_1064GS = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hyundaimaestro HDT-7427GU */
    val HDT_7427GU = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hyundaimaestro HDT_7433H_PLUS */
    val HDT_7433H_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hyundaimaestro HDT-7433X */
    val HDT_7433X = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hyundaimaestro HDT-9421GU */
    val HDT_9421GU = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hyundaimaestro HDT-9433X */
    val HDT_9433X = "spec:width=600,height=1024,unit=px,dpi=160"

}
