package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Olive device specifications for Android Compose previews.
 *
 * This extension provides Olive device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Olive.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Olive: Any
  get() = object {
      /** Olive bruno */
      val BRUNO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Olive shilin */
      val SHILIN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
