package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Vectra device specifications for Android Compose previews.
 *
 * This extension provides Vectra device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vectra.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vectra: Any
  get() = object {
      /** Vectra DV8519-Vectra */
      val DV8519_VECTRA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
