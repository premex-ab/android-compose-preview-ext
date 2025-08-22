package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IIIF150 device specifications for Android Compose previews.
 *
 * This extension provides IIIF150 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IIIF150.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IIIF150: Any
  get() = object {
      /** IIIF150 Air1 */
      val AIR1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** IIIF150 Air1_Pro */
      val AIR1_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** IIIF150 Air1_Ultra */
      val AIR1_ULTRA = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** IIIF150 Air1_Ultra_Pro */
      val AIR1_ULTRA_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** IIIF150 Air3 */
      val AIR3 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** IIIF150 Air3S */
      val AIR3S = "spec:width=720,height=1612,unit=px,dpi=280"

      /** IIIF150 B1 */
      val B1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** IIIF150 B1_Pro */
      val B1_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** IIIF150 B2 */
      val B2 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** IIIF150 B2_Pro */
      val B2_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** IIIF150 B2_Ultra */
      val B2_ULTRA = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** IIIF150 B3 */
      val B3 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** IIIF150 B3C */
      val B3C = "spec:width=720,height=1612,unit=px,dpi=280"

      /** IIIF150 Raptor */
      val RAPTOR = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
