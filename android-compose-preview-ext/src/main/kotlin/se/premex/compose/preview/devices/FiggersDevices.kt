package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * FIGGERS device specifications for Android Compose previews.
 *
 * This extension provides FIGGERS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Figgers.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Figgers: Any
  get() = object {
      /** FIGGERS Figgers_F3 */
      val FIGGERS_F3 = "spec:width=1080,height=2246,unit=px,dpi=480"

  }
