package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Spectra_Geospatial device specifications for Android Compose previews.
 *
 * This extension provides Spectra_Geospatial device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SpectraGeospatial.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SpectraGeospatial: Any
  get() = object {
      /** Spectra_Geospatial MM60_2 */
      val MM60_2 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
