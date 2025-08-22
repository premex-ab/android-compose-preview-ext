package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Speedata device specifications for Android Compose previews.
 *
 * This extension provides Speedata device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Speedata.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Speedata: Any
  get() = object {
      /** Speedata SD100 */
      val SD100 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
