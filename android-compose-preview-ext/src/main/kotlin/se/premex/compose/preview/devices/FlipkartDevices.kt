package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Flipkart device specifications for Android Compose previews.
 *
 * This extension provides Flipkart device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Flipkart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Flipkart: Any
  get() = object {
      /** Flipkart shibuya */
      val SHIBUYA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Flipkart SW4H */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
