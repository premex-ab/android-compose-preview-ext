package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cloudfone device specifications for Android Compose previews.
 *
 * This extension provides Cloudfone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cloudfone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cloudfone get() = object {
    /** Cloudfone CloudFone Excite Prime 2 */
    val CLOUDFONE_EXCITE_PRIME_2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Cloudfone CloudFone Next Infinity Plus */
    val CLOUDFONE_NEXT_INFINITY_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Cloudfone CloudFone Next Infinity Pro */
    val CLOUDFONE_NEXT_INFINITY_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Cloudfone CloudFone Thrill Boost 3 */
    val CLOUDFONE_THRILL_BOOST_3 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Cloudfone Go SP 2 */
    val GO_SP_2 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Cloudfone Thrill Boost 2 */
    val THRILL_BOOST_2 = "spec:width=480,height=854,unit=px,dpi=240"

}
