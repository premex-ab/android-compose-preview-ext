package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Noryox device specifications for Android Compose previews.
 *
 * This extension provides Noryox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Noryox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Noryox: Any
  get() = object {
      /** Noryox Handheld-POS */
      val HANDHELD_POS = "spec:width=720,height=1440,unit=px,dpi=320"

  }
