package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Compaq device specifications for Android Compose previews.
 *
 * This extension provides Compaq device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Compaq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Compaq: Any
  get() = object {
      /** Compaq fireball */
      val FIREBALL = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Compaq Q6 */
      val Q6 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Compaq QT10 */
      val QT10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Compaq QTAB */
      val QTAB = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Compaq Qtab10 */
      val QTAB10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Compaq Qtab10Plus */
      val QTAB10PLUS = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Compaq QTab10_LTE */
      val QTAB10_LTE = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Compaq QTab8 */
      val QTAB8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Compaq QTab8_LTE */
      val QTAB8_LTE = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Compaq QTAB_NOTE */
      val QTAB_NOTE = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
