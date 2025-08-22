package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Panavox device specifications for Android Compose previews.
 *
 * This extension provides Panavox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Panavox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Panavox: Any
  get() = object {
      /** Panavox hamamatsucho */
      val HAMAMATSUCHO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Panavox lushan */
      val LUSHAN = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** Panavox songshan */
      val SONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Panavox xiaoyushan */
      val XIAOYUSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
