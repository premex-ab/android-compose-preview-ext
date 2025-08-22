package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Planet device specifications for Android Compose previews.
 *
 * This extension provides Planet device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Planet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Planet: Any
  get() = object {
      /** Planet Astro */
      val ASTRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Planet Cosmo_Communicator */
      val COSMO_COMMUNICATOR = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Planet Gemini_4G */
      val GEMINI_4G = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
