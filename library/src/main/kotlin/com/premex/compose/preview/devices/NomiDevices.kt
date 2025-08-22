package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Nomi device specifications for Android Compose previews.
 *
 * This extension provides Nomi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nomi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nomi: Any
  get() = object {
      /** Nomi i5012 */
      val I5012 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Nomi i5013 */
      val I5013 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Nomi i5014 */
      val I5014 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Nomi i5050 */
      val I5050 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Nomi i6030 */
      val I6030 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Nomi Nomi_C070011 */
      val NOMI_C070011 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Nomi Nomi_C070012 */
      val NOMI_C070012 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Nomi Nomi_C070014 */
      val NOMI_C070014 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Nomi Nomi_C070014L */
      val NOMI_C070014L = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Nomi Nomi_C070034 */
      val NOMI_C070034 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Nomi Nomi_C070044 */
      val NOMI_C070044 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Nomi Nomi_C080014 */
      val NOMI_C080014 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Nomi Nomi_C080034 */
      val NOMI_C080034 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Nomi Nomi_C101010_Ultra2 */
      val NOMI_C101010_ULTRA2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Nomi Nomi_C101012 */
      val NOMI_C101012 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Nomi Nomi_C101014 */
      val NOMI_C101014 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Nomi Nomi_C101030 */
      val NOMI_C101030 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Nomi Nomi_C101034 */
      val NOMI_C101034 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Nomi Nomi_C101040 */
      val NOMI_C101040 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Nomi Nomi_C101044 */
      val NOMI_C101044 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Nomi Nomi_i5001 */
      val NOMI_I5001 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Nomi Nomi_i5510 */
      val NOMI_I5510 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
