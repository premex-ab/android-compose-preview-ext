package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * aiwa device specifications for Android Compose previews.
 *
 * This extension provides aiwa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aiwa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aiwa: Any
  get() = object {
      /** aiwa AIWA_Z9_PLUS */
      val AIWA_Z9_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** aiwa JA2-SMP0601 */
      val JA2_SMP0601 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** aiwa JA2-TBA0801 */
      val JA2_TBA0801 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** aiwa JA2-TBA1001 */
      val JA2_TBA1001 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** aiwa JA2-TBA1002 */
      val JA2_TBA1002 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** aiwa JA3-SMP0602 */
      val JA3_SMP0602 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** aiwa JA3-TBA0802 */
      val JA3_TBA0802 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** aiwa JA3-TBA1005 */
      val JA3_TBA1005 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** aiwa JA3-TBA1006-4 */
      val JA3_TBA1006_4 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** aiwa JA3-TBA1006-6 */
      val JA3_TBA1006_6 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** aiwa JA3-TBA1007 */
      val JA3_TBA1007 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** aiwa JA4-TBA1008 */
      val JA4_TBA1008 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** aiwa JA4-TBA1101 */
      val JA4_TBA1101 = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
