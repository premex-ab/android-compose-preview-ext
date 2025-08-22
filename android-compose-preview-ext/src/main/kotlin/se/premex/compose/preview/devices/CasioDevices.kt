package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Casio device specifications for Android Compose previews.
 *
 * This extension provides Casio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Casio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Casio: Any
  get() = object {
      /** Casio ET-L10 */
      val ET_L10 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
