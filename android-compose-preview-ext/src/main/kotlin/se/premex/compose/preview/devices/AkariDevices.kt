package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Akari device specifications for Android Compose previews.
 *
 * This extension provides Akari device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Akari.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Akari: Any
  get() = object {
      /** Akari DV8035 */
      val DV8035 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Akari DV8219 */
      val DV8219 = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
