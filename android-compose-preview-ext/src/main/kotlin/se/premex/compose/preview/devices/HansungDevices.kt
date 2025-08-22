package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Hansung device specifications for Android Compose previews.
 *
 * This extension provides Hansung device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hansung.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hansung: Any
  get() = object {
      /** Hansung seocho */
      val SEOCHO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Hansung shilin */
      val SHILIN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
