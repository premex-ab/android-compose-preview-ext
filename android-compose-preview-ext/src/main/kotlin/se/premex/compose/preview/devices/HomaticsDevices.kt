package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Homatics device specifications for Android Compose previews.
 *
 * This extension provides Homatics device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Homatics.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Homatics: Any
  get() = object {
      /** Homatics HND */
      val HND = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Homatics IAD */
      val IAD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Homatics ICN */
      val ICN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Homatics MIA */
      val MIA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Homatics SEI700HMG */
      val SEI700HMG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Homatics YQB */
      val YQB = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Homatics YQX */
      val YQX = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Homatics YYJ */
      val YYJ = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Homatics YZF */
      val YZF = "spec:width=720,height=1280,unit=px,dpi=320"

  }
