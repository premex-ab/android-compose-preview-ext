package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mlab device specifications for Android Compose previews.
 *
 * This extension provides Mlab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mlab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mlab get() = object {
    /** Mlab 8990 */
    val _8990 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mlab 9095 */
    val _9095 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Mlab 9096 */
    val _9096 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Mlab 9098 */
    val _9098 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mlab 9342 */
    val _9342 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Mlab 9343 */
    val _9343 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mlab 9344 */
    val _9344 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Mlab MB4 */
    val MB4 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Mlab MB4_3G */
    val MB4_3G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Mlab MB4_3G_PLUS_SE */
    val MB4_3G_PLUS_SE = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Mlab MB4 WIFI */
    val MB4_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Mlab MB8715 */
    val MB8715 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Mlab MB8717 */
    val MB8717 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mlab MB8866 */
    val MB8866 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mlab  MLAB_GLOWY7 */
    val MLAB_GLOWY7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Mlab MLAB_GLOWY8 */
    val MLAB_GLOWY8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mlab MLAB_KIDS_PLUS */
    val MLAB_KIDS_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Mlab Studio_Phone_10 */
    val STUDIO_PHONE_10 = "spec:width=800,height=1280,unit=px,dpi=213"

}
