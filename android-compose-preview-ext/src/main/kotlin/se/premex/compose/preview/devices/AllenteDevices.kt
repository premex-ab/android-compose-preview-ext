package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Allente device specifications for Android Compose previews.
 *
 * This extension provides Allente device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Allente.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Allente: Any
  get() = object {
      /** Allente SEI700ALLG */
      val SEI700ALLG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
