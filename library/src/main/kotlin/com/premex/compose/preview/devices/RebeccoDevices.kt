package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Rebecco device specifications for Android Compose previews.
 *
 * This extension provides Rebecco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rebecco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rebecco: Any
  get() = object {
      /** Rebecco K30_EEA */
      val K30_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Rebecco K30_ROW */
      val K30_ROW = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Rebecco K50_EEA */
      val K50_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Rebecco K50_ROW */
      val K50_ROW = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Rebecco K50_ROW_B */
      val K50_ROW_B = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Rebecco K70i_EEA */
      val K70I_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Rebecco K70_EEA */
      val K70_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Rebecco K70_ROW */
      val K70_ROW = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Rebecco K80_ROW */
      val K80_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Rebecco M30_Pro */
      val M30_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

  }
