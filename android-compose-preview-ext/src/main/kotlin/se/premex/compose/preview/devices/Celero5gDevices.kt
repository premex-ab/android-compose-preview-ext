package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Celero5G device specifications for Android Compose previews.
 *
 * This extension provides Celero5G device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Celero5g.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Celero5g: Any
  get() = object {
      /** Celero5G Jupiter */
      val JUPITER = "spec:width=720,height=1600,unit=px,dpi=300"

  }
