package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RUIO device specifications for Android Compose previews.
 *
 * This extension provides RUIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RUIO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RUIO: Any
  get() = object {
      /** RUIO Blitz */
      val BLITZ = "spec:width=576,height=1280,unit=px,dpi=240"

      /** RUIO M671M4 */
      val M671M4 = "spec:width=480,height=960,unit=px,dpi=240"

      /** RUIO M675M4 */
      val M675M4 = "spec:width=480,height=960,unit=px,dpi=240"

      /** RUIO RUIO_S5006 */
      val RUIO_S5006 = "spec:width=480,height=960,unit=px,dpi=240"

      /** RUIO RUIO_S518 */
      val RUIO_S518 = "spec:width=480,height=854,unit=px,dpi=240"

      /** RUIO S5506 */
      val S5506 = "spec:width=540,height=1132,unit=px,dpi=240"

      /** RUIO S6501 */
      val S6501 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** RUIO S6506 */
      val S6506 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** RUIO S6518 */
      val S6518 = "spec:width=540,height=1200,unit=px,dpi=240"

  }
