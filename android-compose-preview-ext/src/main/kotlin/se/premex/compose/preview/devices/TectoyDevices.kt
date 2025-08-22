package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TECTOY device specifications for Android Compose previews.
 *
 * This extension provides TECTOY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tectoy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tectoy: Any
  get() = object {
      /** TECTOY TokyoPro */
      val TOKYOPRO = "spec:width=720,height=1520,unit=px,dpi=320"

  }
