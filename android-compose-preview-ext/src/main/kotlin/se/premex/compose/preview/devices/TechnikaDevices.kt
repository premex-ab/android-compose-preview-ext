package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Technika device specifications for Android Compose previews.
 *
 * This extension provides Technika device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Technika.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Technika: Any
  get() = object {
      /** Technika ewha */
      val EWHA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
