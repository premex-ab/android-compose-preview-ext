package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Siragon device specifications for Android Compose previews.
 *
 * This extension provides Siragon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Siragon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Siragon: Any
  get() = object {
      /** Siragon Siragon_SP_7200 */
      val SIRAGON_SP_7200 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Siragon Siragon_SP_7300 */
      val SIRAGON_SP_7300 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Siragon SP-5250 */
      val SP_5250 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Siragon SP-5300 */
      val SP_5300 = "spec:width=540,height=960,unit=px,dpi=240"

      /** Siragon SP-5450 */
      val SP_5450 = "spec:width=444,height=960,unit=px,dpi=240"

      /** Siragon SP-6000 */
      val SP_6000 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** Siragon SP-6150 */
      val SP_6150 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Siragon SP-6200 */
      val SP_6200 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** Siragon SP-7050 */
      val SP_7050 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Siragon SP_7250 */
      val SP_7250 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Siragon SP_7275 */
      val SP_7275 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** Siragon TB-5300 */
      val TB_5300 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Siragon TB_5400 */
      val TB_5400 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Siragon TB_7400 */
      val TB_7400 = "spec:width=1440,height=2200,unit=px,dpi=300"

  }
