package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * surface device specifications for Android Compose previews.
 *
 * This extension provides surface device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Surface.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Surface: Any
  get() = object {
      /** surface duo */
      val DUO = "spec:width=1350,height=1800,unit=px,dpi=400"

      /** surface duo2 */
      val DUO2 = "spec:width=1344,height=1892,unit=px,dpi=400"

  }
