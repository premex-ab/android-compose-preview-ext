package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * GM device specifications for Android Compose previews.
 *
 * This extension provides GM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gm.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gm: Any
  get() = object {
      /** GM e-tab20 */
      val E_TAB20 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** GM e-tab20_variant */
      val E_TAB20_VARIANT = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** GM G008 */
      val G008 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** GM G008_d */
      val G008_D = "spec:width=720,height=1440,unit=px,dpi=320"

      /** GM G100 */
      val G100 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** GM G300 */
      val G300 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** GM G301 */
      val G301 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** GM G310 */
      val G310 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** GM G312 */
      val G312 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** GM G314 */
      val G314 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** GM G316 */
      val G316 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** GM G318 */
      val G318 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** GM G501 */
      val G501 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** GM G510 */
      val G510 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** GM G512 */
      val G512 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** GM G514 */
      val G514 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** GM G518 */
      val G518 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** GM G700 */
      val G700 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** GM G702 */
      val G702 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** GM G901 */
      val G901 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** GM GM8_d_sprout */
      val GM8_D_SPROUT = "spec:width=720,height=1440,unit=px,dpi=320"

      /** GM GM8_sprout */
      val GM8_SPROUT = "spec:width=720,height=1440,unit=px,dpi=320"

      /** GM GM9PLUS_s */
      val GM9PLUS_S = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** GM GM9PRO_d_sprout */
      val GM9PRO_D_SPROUT = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** GM GM9PRO_sprout */
      val GM9PRO_SPROUT = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
