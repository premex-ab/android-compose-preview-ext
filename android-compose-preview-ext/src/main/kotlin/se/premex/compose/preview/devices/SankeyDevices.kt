package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Sankey device specifications for Android Compose previews.
 *
 * This extension provides Sankey device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sankey.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sankey: Any
  get() = object {
      /** Sankey TAB7A3G05 */
      val TAB7A3G05 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
