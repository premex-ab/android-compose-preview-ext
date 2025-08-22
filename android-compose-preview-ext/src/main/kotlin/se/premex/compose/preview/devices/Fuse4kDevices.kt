package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * FUSE4K device specifications for Android Compose previews.
 *
 * This extension provides FUSE4K device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fuse4k.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fuse4k: Any
  get() = object {
      /** FUSE4K SEI700L */
      val SEI700L = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** FUSE4K SEI700TV */
      val SEI700TV = "spec:width=720,height=1280,unit=px,dpi=320"

  }
