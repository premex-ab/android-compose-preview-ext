package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ADSUN device specifications for Android Compose previews.
 *
 * This extension provides ADSUN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Adsun.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Adsun: Any
  get() = object {
      /** ADSUN stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

  }
