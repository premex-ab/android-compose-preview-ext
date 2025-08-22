package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kurio device specifications for Android Compose previews.
 *
 * This extension provides Kurio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kurio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kurio get() = object {
    /** Kurio K01023 */
    val K01023 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Kurio K01023US */
    val K01023US = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Kurio K01524 */
    val K01524 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Kurio KURIO LITE GO NEW */
    val KURIO_LITE_GO_NEW = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Kurio Kurio Smart 2 in 1 PRO */
    val KURIO_SMART_2_IN_1_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Kurio Kurio Tab  */
    val KURIO_TAB = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Kurio Smart Tab 7  */
    val SMART_TAB_7 = "spec:width=600,height=1024,unit=px,dpi=160"

}
