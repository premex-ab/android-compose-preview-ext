package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * PIONEER_DIGITAL_TV device specifications for Android Compose previews.
 *
 * This extension provides PIONEER_DIGITAL_TV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PioneerDigitalTv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PioneerDigitalTv: Any
  get() = object {
      /** PIONEER_DIGITAL_TV SEI900PD */
      val SEI900PD = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
