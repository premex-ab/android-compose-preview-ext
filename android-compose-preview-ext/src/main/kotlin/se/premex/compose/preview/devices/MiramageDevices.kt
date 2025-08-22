package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Miramage device specifications for Android Compose previews.
 *
 * This extension provides Miramage device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Miramage.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Miramage: Any
  get() = object {
      /** Miramage barking */
      val BARKING = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Miramage beaudry */
      val BEAUDRY = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Miramage surface */
      val SURFACE = "spec:width=2160,height=3840,unit=px,dpi=320"

  }
