package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Posfic device specifications for Android Compose previews.
 *
 * This extension provides Posfic device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Posfic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Posfic: Any
  get() = object {
      /** Posfic seocho */
      val SEOCHO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
