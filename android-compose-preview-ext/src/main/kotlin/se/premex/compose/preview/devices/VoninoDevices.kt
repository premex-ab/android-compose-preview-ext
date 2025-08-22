package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Vonino device specifications for Android Compose previews.
 *
 * This extension provides Vonino device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vonino.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vonino: Any
  get() = object {
      /** Vonino Epic_E8 */
      val EPIC_E8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Vonino iMart_Pro */
      val IMART_PRO = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Vonino Magnet_G30 */
      val MAGNET_G30 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Vonino Magnet_G50 */
      val MAGNET_G50 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Vonino Magnet_M10 */
      val MAGNET_M10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Vonino Magnet_M10_2020 */
      val MAGNET_M10_2020 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Vonino Magnet_M1_A7 */
      val MAGNET_M1_A7 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Vonino Pluri_M7_2020 */
      val PLURI_M7_2020 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Vonino Pluri_M8 */
      val PLURI_M8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Vonino Pluri_M8_2020 */
      val PLURI_M8_2020 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Vonino Pluri_M8_2020_A10 */
      val PLURI_M8_2020_A10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Vonino Xavy_T7 */
      val XAVY_T7 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
