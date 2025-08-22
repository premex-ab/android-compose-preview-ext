package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TVSTAR device specifications for Android Compose previews.
 *
 * This extension provides TVSTAR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tvstar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tvstar: Any
  get() = object {
      /** TVSTAR seocho */
      val SEOCHO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
