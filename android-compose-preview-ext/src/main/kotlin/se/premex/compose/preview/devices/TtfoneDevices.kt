package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TTfone device specifications for Android Compose previews.
 *
 * This extension provides TTfone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ttfone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ttfone: Any
  get() = object {
      /** TTfone TTfone_TT20 */
      val TTFONE_TT20 = "spec:width=480,height=800,unit=px,dpi=240"

  }
