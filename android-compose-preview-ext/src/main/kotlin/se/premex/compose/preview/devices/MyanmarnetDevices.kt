package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MyanmarNet device specifications for Android Compose previews.
 *
 * This extension provides MyanmarNet device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Myanmarnet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Myanmarnet: Any
  get() = object {
      /** MyanmarNet SEI140FT */
      val SEI140FT = "spec:width=720,height=1280,unit=px,dpi=213"

  }
