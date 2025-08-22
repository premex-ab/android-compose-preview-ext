package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Polsat device specifications for Android Compose previews.
 *
 * This extension provides Polsat device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Polsat.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Polsat: Any
  get() = object {
      /** Polsat m391_polsat */
      val M391_POLSAT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
