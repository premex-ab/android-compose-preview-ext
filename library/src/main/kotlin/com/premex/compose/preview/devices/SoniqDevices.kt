package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SONIQ device specifications for Android Compose previews.
 *
 * This extension provides SONIQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Soniq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Soniq: Any
  get() = object {
      /** SONIQ hanyang */
      val HANYANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SONIQ mateo */
      val MATEO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SONIQ osaki */
      val OSAKI = "spec:width=720,height=1280,unit=px,dpi=213"

  }
