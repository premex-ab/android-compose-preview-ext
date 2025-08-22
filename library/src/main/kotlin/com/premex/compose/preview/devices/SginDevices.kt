package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SGIN device specifications for Android Compose previews.
 *
 * This extension provides SGIN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sgin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sgin: Any
  get() = object {
      /** SGIN A10 */
      val A10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SGIN C10 */
      val C10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SGIN C8 */
      val C8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SGIN E10P */
      val E10P = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SGIN SGIN_E10M */
      val SGIN_E10M = "spec:width=800,height=1280,unit=px,dpi=240"

      /** SGIN SGIN_X10 */
      val SGIN_X10 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** SGIN T10S */
      val T10S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SGIN T12S */
      val T12S = "spec:width=1200,height=2000,unit=px,dpi=213"

      /** SGIN T12S_EEA */
      val T12S_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** SGIN T12S_ROW */
      val T12S_ROW = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** SGIN T12_EEA */
      val T12_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** SGIN T12_ROW */
      val T12_ROW = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
