package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * None device specifications for Android Compose previews.
 *
 * This extension provides None device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.None.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.None get() = object {
    /** None NpadAir */
    val NPADAIR = "spec:width=800,height=1280,unit=px,dpi=210"

    /** None Npad_mini  */
    val NPAD_MINI = "spec:width=800,height=1280,unit=px,dpi=160"

    /** None Npadplus */
    val NPADPLUS = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** None NpadQ */
    val NPADQ = "spec:width=800,height=1280,unit=px,dpi=160"

    /** None NpadS */
    val NPADS = "spec:width=800,height=1280,unit=px,dpi=160"

    /** None Npad_ultra */
    val NPAD_ULTRA = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** None NpadX1 */
    val NPADX1 = "spec:width=1200,height=2000,unit=px,dpi=213"

    /** None NpadY */
    val NPADY = "spec:width=800,height=1280,unit=px,dpi=160"

    /** None NpadY1 */
    val NPADY1 = "spec:width=800,height=1280,unit=px,dpi=160"

}
