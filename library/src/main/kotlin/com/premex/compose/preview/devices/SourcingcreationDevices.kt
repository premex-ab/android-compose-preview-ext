package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sourcingcreation device specifications for Android Compose previews.
 *
 * This extension provides Sourcingcreation device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sourcingcreation.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sourcingcreation get() = object {
    /** Sourcingcreation Smart Tab 1004XS */
    val SMART_TAB_1004XS = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Sourcingcreation Smart TAB 1005 */
    val SMART_TAB_1005 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Sourcingcreation Smart Tab 1006 */
    val SMART_TAB_1006 = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Sourcingcreation WebPad1004 */
    val WEBPAD1004 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Sourcingcreation Wooze L */
    val WOOZE_L = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Sourcingcreation Wooze XL */
    val WOOZE_XL = "spec:width=720,height=1280,unit=px,dpi=320"

}
