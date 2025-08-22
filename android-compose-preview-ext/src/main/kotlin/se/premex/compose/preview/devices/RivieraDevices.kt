package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Riviera device specifications for Android Compose previews.
 *
 * This extension provides Riviera device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Riviera.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Riviera: Any
  get() = object {
      /** Riviera hamamatsucho */
      val HAMAMATSUCHO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Riviera ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Riviera sindorim */
      val SINDORIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Riviera songshan */
      val SONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Riviera xiaoyushan */
      val XIAOYUSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
