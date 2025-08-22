package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gateway device specifications for Android Compose previews.
 *
 * This extension provides Gateway device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gateway.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gateway get() = object {
    /** Gateway GAKM10822 */
    val GAKM10822 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Gateway GATA30812 */
    val GATA30812 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gateway GATA31012 */
    val GATA31012 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Gateway GATM10822 */
    val GATM10822 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Gateway GATM11022 */
    val GATM11022 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Gateway GATM11033 */
    val GATM11033 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Gateway 	GWAT10_1  */
    val GWAT10_1 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gateway GWAT8_1 */
    val GWAT8_1 = "spec:width=800,height=1280,unit=px,dpi=213"

}
