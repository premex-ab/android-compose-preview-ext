package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Spectra device specifications for Android Compose previews.
 *
 * This extension provides Spectra device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Spectra.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Spectra: Any
  get() = object {
      /** Spectra bcat */
      val BCAT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Spectra MobileMapper6 */
      val MOBILEMAPPER6 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
