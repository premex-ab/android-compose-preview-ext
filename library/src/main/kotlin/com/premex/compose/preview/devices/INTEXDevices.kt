package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * INTEX device specifications for Android Compose previews.
 *
 * This extension provides INTEX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.INTEX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.INTEX: Any
  get() = object {
      /** INTEX INTEX_AQUA_A4_PLUS */
      val INTEX_AQUA_A4_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** INTEX INTEX_AQUA_LIONS_2 */
      val INTEX_AQUA_LIONS_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** INTEX INTEX_AQUA_LIONS_3 */
      val INTEX_AQUA_LIONS_3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** INTEX INTEX_AQUA_LIONS_4G */
      val INTEX_AQUA_LIONS_4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** INTEX INTEX_AQUA_S3 */
      val INTEX_AQUA_S3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** INTEX INTEX_AQUA_SELFIE */
      val INTEX_AQUA_SELFIE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** INTEX INTEX_AQUA_STYLE_3 */
      val INTEX_AQUA_STYLE_3 = "spec:width=480,height=854,unit=px,dpi=240"

      /** INTEX INTEX_ELYT_DUAL */
      val INTEX_ELYT_DUAL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** INTEX R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

  }
