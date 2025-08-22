package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ngmitaliasrl device specifications for Android Compose previews.
 *
 * This extension provides Ngmitaliasrl device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ngmitaliasrl.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ngmitaliasrl get() = object {
    /** Ngmitaliasrl NGM Youcolor E506 */
    val NGM_YOUCOLOR_E506 = "spec:width=480,height=854,unit=px,dpi=240"

}
