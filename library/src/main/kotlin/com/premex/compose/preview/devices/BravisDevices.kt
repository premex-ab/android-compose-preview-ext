package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bravis device specifications for Android Compose previews.
 *
 * This extension provides Bravis device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bravis.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bravis get() = object {
    /** Bravis A511 Harmony */
    val A511_HARMONY = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bravis A512 Harmony Pro */
    val A512_HARMONY_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bravis bravis_A506 */
    val BRAVIS_A506 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bravis N1_550_Cruiser */
    val N1_550_CRUISER = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Bravis N1-570 Space */
    val N1_570_SPACE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bravis NB108 */
    val NB108 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Bravis NB753 */
    val NB753 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Bravis NB76 */
    val NB76 = "spec:width=720,height=1280,unit=px,dpi=160"

    /** Bravis NB851 */
    val NB851 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Bravis NB871 */
    val NB871 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Bravis X500 */
    val X500 = "spec:width=720,height=1280,unit=px,dpi=320"

}
