package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Movitel device specifications for Android Compose previews.
 *
 * This extension provides Movitel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Movitel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Movitel: Any
  get() = object {
      /** Movitel M8416 */
      val M8416 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Movitel M8419 */
      val M8419 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Movitel M8420 */
      val M8420 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Movitel M8421 */
      val M8421 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Movitel M8422 */
      val M8422 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Movitel M8423 */
      val M8423 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** Movitel M8424 */
      val M8424 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Movitel M8425 */
      val M8425 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Movitel M8426 */
      val M8426 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Movitel M9106 */
      val M9106 = "spec:width=480,height=854,unit=px,dpi=213"

      /** Movitel M9107 */
      val M9107 = "spec:width=480,height=854,unit=px,dpi=213"

      /** Movitel M9108 */
      val M9108 = "spec:width=480,height=854,unit=px,dpi=200"

      /** Movitel M9109 */
      val M9109 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Movitel M9110 */
      val M9110 = "spec:width=480,height=960,unit=px,dpi=200"

      /** Movitel M9111 */
      val M9111 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Movitel M9112 */
      val M9112 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Movitel M9113 */
      val M9113 = "spec:width=540,height=960,unit=px,dpi=240"

      /** Movitel M9114 */
      val M9114 = "spec:width=480,height=854,unit=px,dpi=213"

      /** Movitel M9116 */
      val M9116 = "spec:width=480,height=960,unit=px,dpi=200"

      /** Movitel M9117 */
      val M9117 = "spec:width=480,height=854,unit=px,dpi=200"

  }
