package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Optage device specifications for Android Compose previews.
 *
 * This extension provides Optage device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Optage.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Optage: Any
  get() = object {
      /** Optage Amigo7xJP */
      val AMIGO7XJP = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
