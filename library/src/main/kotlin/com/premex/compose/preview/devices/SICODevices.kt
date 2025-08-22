package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SICO device specifications for Android Compose previews.
 *
 * This extension provides SICO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SICO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SICO: Any
  get() = object {
      /** SICO Diamond_2 */
      val DIAMOND_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SICO Mega2 */
      val MEGA2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SICO Mega2max */
      val MEGA2MAX = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SICO More_3 */
      val MORE_3 = "spec:width=480,height=800,unit=px,dpi=240"

      /** SICO Nile_X */
      val NILE_X = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SICO Plus2 */
      val PLUS2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** SICO Plus3_4G */
      val PLUS3_4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** SICO SICO_Express3 */
      val SICO_EXPRESS3 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** SICO Topaz */
      val TOPAZ = "spec:width=720,height=1280,unit=px,dpi=320"

  }
