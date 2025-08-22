package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Melita device specifications for Android Compose previews.
 *
 * This extension provides Melita device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Melita.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Melita: Any
  get() = object {
      /** Melita DV8955C-C-KMM */
      val DV8955C_C_KMM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
