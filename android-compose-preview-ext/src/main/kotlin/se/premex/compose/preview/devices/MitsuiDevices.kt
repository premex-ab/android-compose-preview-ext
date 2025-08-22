package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Mitsui device specifications for Android Compose previews.
 *
 * This extension provides Mitsui device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mitsui.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mitsui: Any
  get() = object {
      /** Mitsui MC32020 */
      val MC32020 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
