package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SpectraGeospatial device specifications for Android Compose previews.
 *
 * This extension provides SpectraGeospatial device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Spectrageospatial.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Spectrageospatial: Any
  get() = object {
      /** SpectraGeospatial E7167 */
      val E7167 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
