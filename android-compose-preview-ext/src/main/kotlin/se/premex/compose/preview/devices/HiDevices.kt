package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Hi device specifications for Android Compose previews.
 *
 * This extension provides Hi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hi: Any
  get() = object {
      /** Hi Boost_Max */
      val BOOST_MAX = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Hi Boost_Ultra */
      val BOOST_ULTRA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Hi HMR5012 */
      val HMR5012 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Hi HMR5450 */
      val HMR5450 = "spec:width=480,height=960,unit=px,dpi=240"

  }
