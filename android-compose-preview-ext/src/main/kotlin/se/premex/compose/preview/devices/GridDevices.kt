package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * GRID device specifications for Android Compose previews.
 *
 * This extension provides GRID device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Grid.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Grid: Any
  get() = object {
      /** GRID GRID_GS6100 */
      val GRID_GS6100 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
