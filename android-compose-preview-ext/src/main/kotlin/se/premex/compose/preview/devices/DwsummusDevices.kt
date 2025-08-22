package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DWSUMMUS device specifications for Android Compose previews.
 *
 * This extension provides DWSUMMUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dwsummus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dwsummus: Any
  get() = object {
      /** DWSUMMUS marina */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DWSUMMUS seocho */
      val SEOCHO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
