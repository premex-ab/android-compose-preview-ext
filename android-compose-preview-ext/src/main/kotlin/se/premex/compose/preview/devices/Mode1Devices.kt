package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Mode1 device specifications for Android Compose previews.
 *
 * This extension provides Mode1 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mode1.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mode1: Any
  get() = object {
      /** Mode1 MD06P */
      val MD06P = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Mode1 MD-03P */
      val MD_03P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Mode1 MD-04P */
      val MD_04P = "spec:width=1080,height=2220,unit=px,dpi=440"

  }
