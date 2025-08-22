package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Syinix device specifications for Android Compose previews.
 *
 * This extension provides Syinix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Syinix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Syinix: Any
  get() = object {
      /** Syinix barking */
      val BARKING = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Syinix beaudry */
      val BEAUDRY = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Syinix ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Syinix redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Syinix samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Syinix SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** Syinix umeda */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
