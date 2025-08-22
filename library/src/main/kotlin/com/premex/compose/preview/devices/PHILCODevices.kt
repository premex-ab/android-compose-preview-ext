package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PHILCO device specifications for Android Compose previews.
 *
 * This extension provides PHILCO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PHILCO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PHILCO: Any
  get() = object {
      /** PHILCO elliniko */
      val ELLINIKO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** PHILCO ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** PHILCO P510 */
      val P510 = "spec:width=480,height=854,unit=px,dpi=240"

      /** PHILCO P610 */
      val P610 = "spec:width=480,height=960,unit=px,dpi=220"

      /** PHILCO PHILCO_TP7A6 */
      val PHILCO_TP7A6 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PHILCO PTB8R */
      val PTB8R = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PHILCO PTB8R4G */
      val PTB8R4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PHILCO stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** PHILCO SW4H */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** PHILCO TP10A332 */
      val TP10A332 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PHILCO TP10A3N */
      val TP10A3N = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PHILCO TP10A464 */
      val TP10A464 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PHILCO TP10F */
      val TP10F = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PHILCO TP7A464 */
      val TP7A464 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PHILCO TP7A4N */
      val TP7A4N = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PHILCO zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
