package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MEFERI device specifications for Android Compose previews.
 *
 * This extension provides MEFERI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Meferi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Meferi: Any
  get() = object {
      /** MEFERI ME10 */
      val ME10 = "spec:width=480,height=800,unit=px,dpi=200"

      /** MEFERI ME40K */
      val ME40K = "spec:width=480,height=800,unit=px,dpi=200"

      /** MEFERI ME61 */
      val ME61 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** MEFERI ME74 */
      val ME74 = "spec:width=480,height=800,unit=px,dpi=210"

  }
