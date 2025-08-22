package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Stylos device specifications for Android Compose previews.
 *
 * This extension provides Stylos device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Stylos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Stylos: Any
  get() = object {
      /** Stylos Tab104 */
      val TAB104 = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
