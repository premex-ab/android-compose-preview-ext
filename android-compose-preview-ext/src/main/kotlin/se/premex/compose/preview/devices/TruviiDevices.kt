package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Truvii device specifications for Android Compose previews.
 *
 * This extension provides Truvii device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Truvii.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Truvii: Any
  get() = object {
      /** Truvii bruno */
      val BRUNO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Truvii seocho */
      val SEOCHO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Truvii shilin */
      val SHILIN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Truvii sugamo */
      val SUGAMO = "spec:width=720,height=1280,unit=px,dpi=213"

  }
