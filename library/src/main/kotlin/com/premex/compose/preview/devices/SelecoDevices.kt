package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Seleco device specifications for Android Compose previews.
 *
 * This extension provides Seleco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Seleco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Seleco: Any
  get() = object {
      /** Seleco barking */
      val BARKING = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Seleco beaudry */
      val BEAUDRY = "spec:width=720,height=1280,unit=px,dpi=213"

  }
