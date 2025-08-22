package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * FPS device specifications for Android Compose previews.
 *
 * This extension provides FPS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fps.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fps: Any
  get() = object {
      /** FPS hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
