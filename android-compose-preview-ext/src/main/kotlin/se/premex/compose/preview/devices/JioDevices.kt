package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Jio device specifications for Android Compose previews.
 *
 * This extension provides Jio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Jio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jio: Any
  get() = object {
      /** Jio LS1542QW */
      val LS1542QW = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Jio LS1542QWN */
      val LS1542QWN = "spec:width=720,height=1440,unit=px,dpi=320"

  }
