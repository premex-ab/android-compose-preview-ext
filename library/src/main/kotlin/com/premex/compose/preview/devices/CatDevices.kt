package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cat device specifications for Android Compose previews.
 *
 * This extension provides Cat device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cat.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cat get() = object {
    /** Cat B15 */
    val B15 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Cat B15Q */
    val B15Q = "spec:width=480,height=800,unit=px,dpi=240"

    /** Cat Cat S22 FLIP */
    val CAT_S22_FLIP = "spec:width=480,height=640,unit=px,dpi=240"

    /** Cat Cat S31 */
    val CAT_S31 = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Cat Cat S41 */
    val CAT_S41 = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Cat Cat S42 */
    val CAT_S42 = "spec:width=720,height=1440,unit=px,dpi=280"

    /** Cat Cat S48c */
    val CAT_S48C = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Cat Cat S52 */
    val CAT_S52 = "spec:width=720,height=1440,unit=px,dpi=280"

    /** Cat Cat S61 */
    val CAT_S61 = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Cat Cat S62 */
    val CAT_S62 = "spec:width=1080,height=2160,unit=px,dpi=420"

    /** Cat Cat S62 Pro */
    val CAT_S62_PRO = "spec:width=1080,height=2160,unit=px,dpi=420"

    /** Cat Cat S75 */
    val CAT_S75 = "spec:width=1080,height=2408,unit=px,dpi=400"

    /** Cat S40 */
    val S40 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Cat S50 */
    val S50 = "spec:width=720,height=1280,unit=px,dpi=320"

}
