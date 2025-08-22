package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Onnwalmart device specifications for Android Compose previews.
 *
 * This extension provides Onnwalmart device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Onnwalmart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Onnwalmart get() = object {
    /** Onnwalmart 100005207 */
    val _100005207 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Onnwalmart 100005208 */
    val _100005208 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Onnwalmart 100005208-CA */
    val _100005208_CA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Onnwalmart 100005209 */
    val _100005209 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Onnwalmart 100011886A */
    val _100011886A = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Onnwalmart 100011886CA */
    val _100011886CA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Onnwalmart 100015685-E */
    val _100015685_E = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Onnwalmart 100026191 */
    val _100026191 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Onnwalmart 100043279 */
    val _100043279 = "spec:width=1080,height=1920,unit=px,dpi=320"

    /** Onnwalmart ONA19TB002 */
    val ONA19TB002 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Onnwalmart ONA19TB003 */
    val ONA19TB003 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Onnwalmart ONA19TB007 */
    val ONA19TB007 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Onnwalmart  PM106A  */
    val PM106A = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Onnwalmart PM82T */
    val PM82T = "spec:width=800,height=1340,unit=px,dpi=240"

    /** Onnwalmart PP86A_W */
    val PP86A_W = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Onnwalmart PP86AW */
    val PP86AW = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Onnwalmart TBBVNC100005207 */
    val TBBVNC100005207 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Onnwalmart TBBVNC100005208 */
    val TBBVNC100005208 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Onnwalmart W723 */
    val W723 = "spec:width=600,height=1024,unit=px,dpi=160"

}
