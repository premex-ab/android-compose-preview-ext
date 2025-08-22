package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Logicinstrument device specifications for Android Compose previews.
 *
 * This extension provides Logicinstrument device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Logicinstrument.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Logicinstrument get() = object {
    /** Logicinstrument Logic Instrument Fieldbook 57 */
    val LOGIC_INSTRUMENT_FIELDBOOK_57 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Logicinstrument Logic Instrument Fieldbook N101 */
    val LOGIC_INSTRUMENT_FIELDBOOK_N101 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
