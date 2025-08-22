package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Globe device specifications for Android Compose previews.
 *
 * This extension provides Globe device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Globe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Globe: Any
  get() = object {
      /** Globe SEI120G */
      val SEI120G = "spec:width=720,height=1280,unit=px,dpi=213"

  }
