package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tecnomobile device specifications for Android Compose previews.
 *
 * This extension provides Tecnomobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tecnomobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tecnomobile get() = object {
    /** Tecnomobile CAMON 19 Neo */
    val CAMON_19_NEO = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Tecnomobile POVA 5 Pro 5G */
    val POVA_5_PRO_5G = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Tecnomobile POVA Neo 2 */
    val POVA_NEO_2 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Tecnomobile SPARK Go 2023 */
    val SPARK_GO_2023 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Tecnomobile SPARK Go 2024 */
    val SPARK_GO_2024 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Tecnomobile TECNO Mobile POVA 6 Neo */
    val TECNO_MOBILE_POVA_6_NEO = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Tecnomobile TECNO Mobile SPARK 20 */
    val TECNO_MOBILE_SPARK_20 = "spec:width=1080,height=2248,unit=px,dpi=480"

    /** Tecnomobile TECNO Mobile SPARK 20C */
    val TECNO_MOBILE_SPARK_20C = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Tecnomobile TECNO Mobile SPARK 20 Pro+ */
    val TECNO_MOBILE_SPARK_20_PRO = "spec:width=1080,height=2436,unit=px,dpi=480"

    /** Tecnomobile TECNO SPARK 10 */
    val TECNO_SPARK_10 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Tecnomobile TECNO SPARK 30C */
    val TECNO_SPARK_30C = "spec:width=720,height=1600,unit=px,dpi=320"

}
