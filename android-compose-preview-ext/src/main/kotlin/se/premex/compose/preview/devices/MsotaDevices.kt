package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MSOTA device specifications for Android Compose previews.
 *
 * This extension provides MSOTA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Msota.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Msota: Any
  get() = object {
      /** MSOTA Nobby_S500 */
      val NOBBY_S500 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MSOTA Nobby_X800 */
      val NOBBY_X800 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
