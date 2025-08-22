package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MECOOL device specifications for Android Compose previews.
 *
 * This extension provides MECOOL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mecool.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mecool: Any
  get() = object {
      /** MECOOL BOS */
      val BOS = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MECOOL KA1 */
      val KA1 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MECOOL KA2 */
      val KA2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MECOOL KD1 */
      val KD1 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MECOOL KD2 */
      val KD2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MECOOL KM1 */
      val KM1 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MECOOL KM3 */
      val KM3 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MECOOL KM6 */
      val KM6 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MECOOL KM7 */
      val KM7 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MECOOL KM8 */
      val KM8 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MECOOL KM9PRO */
      val KM9PRO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MECOOL KT1 */
      val KT1 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MECOOL LAS */
      val LAS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MECOOL YDA */
      val YDA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MECOOL YYC */
      val YYC = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MECOOL YYT */
      val YYT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
