package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * geaneepro device specifications for Android Compose previews.
 *
 * This extension provides geaneepro device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Geaneepro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Geaneepro: Any
  get() = object {
      /** geaneepro JT07-90 */
      val JT07_90 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** geaneepro JT10-90 */
      val JT10_90 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
