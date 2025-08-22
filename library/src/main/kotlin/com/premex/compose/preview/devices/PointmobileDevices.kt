package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Pointmobile device specifications for Android Compose previews.
 *
 * This extension provides Pointmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Pointmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Pointmobile get() = object {
    /** Pointmobile PM30 */
    val PM30 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Pointmobile PM351 */
    val PM351 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Pointmobile PM352 */
    val PM352 = "spec:width=480,height=800,unit=px,dpi=200"

    /** Pointmobile PM45 */
    val PM45 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Pointmobile PM451 */
    val PM451 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Pointmobile PM452 */
    val PM452 = "spec:width=480,height=800,unit=px,dpi=200"

    /** Pointmobile PM550 */
    val PM550 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Pointmobile PM66 */
    val PM66 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Pointmobile PM67 */
    val PM67 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Pointmobile PM75 */
    val PM75 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Pointmobile PM80 */
    val PM80 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Pointmobile PM84 */
    val PM84 = "spec:width=720,height=1440,unit=px,dpi=280"

    /** Pointmobile PM85 */
    val PM85 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Pointmobile PM86 */
    val PM86 = "spec:width=1080,height=1920,unit=px,dpi=440"

    /** Pointmobile PM90 */
    val PM90 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Pointmobile PM95 */
    val PM95 = "spec:width=1080,height=2160,unit=px,dpi=400"

    /** Pointmobile PT11 */
    val PT11 = "spec:width=1200,height=2000,unit=px,dpi=240"

}
