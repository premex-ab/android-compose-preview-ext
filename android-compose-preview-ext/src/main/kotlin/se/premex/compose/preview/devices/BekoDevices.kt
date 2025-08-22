package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Beko device specifications for Android Compose previews.
 *
 * This extension provides Beko device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Beko.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Beko: Any
  get() = object {
      /** Beko martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Beko shinagawa */
      val SHINAGAWA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
