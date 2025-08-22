package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Smarttechnologies device specifications for Android Compose previews.
 *
 * This extension provides Smarttechnologies device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Smarttechnologies.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Smarttechnologies get() = object {
    /** Smarttechnologies AM60 series */
    val AM60_SERIES = "spec:width=2160,height=3840,unit=px,dpi=320"

    /** Smarttechnologies SMART Board MX Series (V5) */
    val SMART_BOARD_MX_SERIES_V5 = "spec:width=2160,height=3840,unit=px,dpi=320"

}
