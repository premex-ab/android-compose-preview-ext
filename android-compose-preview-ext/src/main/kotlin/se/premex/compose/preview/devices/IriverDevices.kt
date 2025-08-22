package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Iriver device specifications for Android Compose previews.
 *
 * This extension provides Iriver device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Iriver.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Iriver: Any
  get() = object {
      /** Iriver seocho */
      val SEOCHO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
