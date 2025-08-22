package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Syco device specifications for Android Compose previews.
 *
 * This extension provides Syco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Syco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Syco: Any
  get() = object {
      /** Syco RS-403 */
      val RS_403 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
