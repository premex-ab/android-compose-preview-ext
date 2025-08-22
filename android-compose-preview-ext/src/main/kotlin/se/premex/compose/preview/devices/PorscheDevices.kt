package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Porsche device specifications for Android Compose previews.
 *
 * This extension provides Porsche device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Porsche.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Porsche: Any
  get() = object {
      /** Porsche sdis1 */
      val SDIS1 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
