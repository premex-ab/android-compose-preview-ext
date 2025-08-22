package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Lanix device specifications for Android Compose previews.
 *
 * This extension provides Lanix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lanix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lanix: Any
  get() = object {
      /** Lanix Alpha_1R */
      val ALPHA_1R = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Lanix Alpha_1V */
      val ALPHA_1V = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Lanix ALPHA_3R */
      val ALPHA_3R = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Lanix Alpha_3V */
      val ALPHA_3V = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Lanix Alpha_5V */
      val ALPHA_5V = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Lanix Alpha_9V */
      val ALPHA_9V = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Lanix IliumPad_RX8v2 */
      val ILIUMPAD_RX8V2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Lanix Ilium_Alpha_1TT */
      val ILIUM_ALPHA_1TT = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Lanix Ilium_Alpha_5T */
      val ILIUM_ALPHA_5T = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Lanix Ilium_Alpha_9 */
      val ILIUM_ALPHA_9 = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** Lanix Ilium_L610 */
      val ILIUM_L610 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Lanix Ilium_LT510 */
      val ILIUM_LT510 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Lanix Ilium_M7T */
      val ILIUM_M7T = "spec:width=480,height=960,unit=px,dpi=240"

      /** Lanix ilium_PADE10 */
      val ILIUM_PADE10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Lanix ILIUM_PADE8 */
      val ILIUM_PADE8 = "spec:width=768,height=1024,unit=px,dpi=160"

      /** Lanix L540 */
      val L540 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Lanix RX10ProV7 */
      val RX10PROV7 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Lanix RX10V6 */
      val RX10V6 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Lanix RX10v8 */
      val RX10V8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Lanix RX10v9 */
      val RX10V9 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Lanix RX11 */
      val RX11 = "spec:width=1200,height=2000,unit=px,dpi=213"

      /** Lanix X120C */
      val X120C = "spec:width=320,height=480,unit=px,dpi=160"

      /** Lanix X560 */
      val X560 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Lanix X750 */
      val X750 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Lanix X770 */
      val X770 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Lanix X860 */
      val X860 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
