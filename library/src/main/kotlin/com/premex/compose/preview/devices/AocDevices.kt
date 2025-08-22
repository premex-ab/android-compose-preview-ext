package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Aoc device specifications for Android Compose previews.
 *
 * This extension provides Aoc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Aoc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Aoc get() = object {
    /** Aoc A110_E */
    val A110_E = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Aoc Q10107L-ME */
    val Q10107L_ME = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Aoc Q10107LW-ME */
    val Q10107LW_ME = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Aoc Q8108L-ME */
    val Q8108L_ME = "spec:width=800,height=1280,unit=px,dpi=213"

}
