package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Foxxd device specifications for Android Compose previews.
 *
 * This extension provides Foxxd device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Foxxd.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Foxxd get() = object {
    /** Foxxd A2023 */
    val A2023 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Foxxd A55 */
    val A55 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Foxxd A551 */
    val A551 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Foxxd A56 */
    val A56 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Foxxd A5Pro */
    val A5PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Foxxd A62 */
    val A62 = "spec:width=480,height=1014,unit=px,dpi=200"

    /** Foxxd A65 */
    val A65 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Foxxd A65L */
    val A65L = "spec:width=540,height=1200,unit=px,dpi=200"

    /** Foxxd A65Plus */
    val A65PLUS = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Foxxd A67L */
    val A67L = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Foxxd AS65U */
    val AS65U = "spec:width=576,height=1280,unit=px,dpi=240"

    /** Foxxd C10 */
    val C10 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Foxxd FOXXD C65 */
    val FOXXD_C65 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Foxxd FOXXD HTH C67 */
    val FOXXD_HTH_C67 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Foxxd FOXXD HTH S67 */
    val FOXXD_HTH_S67 = "spec:width=720,height=1600,unit=px,dpi=480"

    /** Foxxd MIRO */
    val MIRO = "spec:width=640,height=1280,unit=px,dpi=240"

    /** Foxxd N5 */
    val N5 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Foxxd P8 */
    val P8 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Foxxd T55 */
    val T55 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Foxxd T8 */
    val T8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Foxxd T8Plus */
    val T8PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Foxxd T8Pro */
    val T8PRO = "spec:width=800,height=1280,unit=px,dpi=240"

}
