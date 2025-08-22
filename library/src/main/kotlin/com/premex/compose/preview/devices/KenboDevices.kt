package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KENBO device specifications for Android Compose previews.
 *
 * This extension provides KENBO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kenbo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kenbo: Any
  get() = object {
      /** KENBO B19 */
      val B19 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** KENBO K6 */
      val K6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** KENBO K7 */
      val K7 = "spec:width=480,height=960,unit=px,dpi=240"

      /** KENBO O51 */
      val O51 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KENBO O61 */
      val O61 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** KENBO O71 */
      val O71 = "spec:width=600,height=1280,unit=px,dpi=240"

  }
