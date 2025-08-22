package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ZETATV device specifications for Android Compose previews.
 *
 * This extension provides ZETATV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zetatv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zetatv: Any
  get() = object {
      /** ZETATV DV8545-C-KUT */
      val DV8545_C_KUT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
