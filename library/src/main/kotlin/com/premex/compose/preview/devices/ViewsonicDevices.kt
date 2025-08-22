package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Viewsonic device specifications for Android Compose previews.
 *
 * This extension provides Viewsonic device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Viewsonic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Viewsonic get() = object {
    /** Viewsonic IFP34 */
    val IFP34 = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Viewsonic IFP51_Series */
    val IFP51_SERIES = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Viewsonic IFP8652-2 */
    val IFP8652_2 = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Viewsonic IN02 series */
    val IN02_SERIES = "spec:width=2160,height=3840,unit=px,dpi=420"

    /** Viewsonic ViewPad_M10 */
    val VIEWPAD_M10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Viewsonic ViewPad_M10_2_32 */
    val VIEWPAD_M10_2_32 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Viewsonic ViewPad_M7_2_32 */
    val VIEWPAD_M7_2_32 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Viewsonic VPC-A31-O1 */
    val VPC_A31_O1 = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Viewsonic VSD242 */
    val VSD242 = "spec:width=1080,height=1920,unit=px,dpi=160"

}
