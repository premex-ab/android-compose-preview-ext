package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Sparx device specifications for Android Compose previews.
 *
 * This extension provides Sparx device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sparx.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sparx: Any
  get() = object {
      /** Sparx NEO5 */
      val NEO5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Sparx Neo8Lite */
      val NEO8LITE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Sparx Neo_11 */
      val NEO_11 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Sparx Neo_5_Plus */
      val NEO_5_PLUS = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Sparx Neo_5_Pro */
      val NEO_5_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Sparx NEO_6 */
      val NEO_6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Sparx Neo_7 */
      val NEO_7 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Sparx Neo_7_Pro */
      val NEO_7_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Sparx Neo_7_Ultra */
      val NEO_7_ULTRA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Sparx Neo_8 */
      val NEO_8 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Sparx Neo_8_Plus */
      val NEO_8_PLUS = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Sparx Neo_8_Pro */
      val NEO_8_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Sparx Neo_X */
      val NEO_X = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Sparx Note_12 */
      val NOTE_12 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Sparx Note_20 */
      val NOTE_20 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Sparx S3 */
      val S3 = "spec:width=480,height=960,unit=px,dpi=220"

      /** Sparx S6 */
      val S6 = "spec:width=480,height=960,unit=px,dpi=200"

      /** Sparx S9 */
      val S9 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Sparx Sparx_Edge_20_Pro */
      val SPARX_EDGE_20_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Sparx Sparx_NEO_9 */
      val SPARX_NEO_9 = "spec:width=720,height=1612,unit=px,dpi=300"

      /** Sparx Sparx_S7 */
      val SPARX_S7 = "spec:width=480,height=960,unit=px,dpi=220"

      /** Sparx Ultra8 */
      val ULTRA8 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Sparx Ultra8Pro */
      val ULTRA8PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Sparx Ultra_11 */
      val ULTRA_11 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Sparx Ultra_8 */
      val ULTRA_8 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Sparx Ultra_8i */
      val ULTRA_8I = "spec:width=720,height=1604,unit=px,dpi=320"

      /** Sparx Ultra_8_Pro */
      val ULTRA_8_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
