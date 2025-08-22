package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mediacom device specifications for Android Compose previews.
 *
 * This extension provides Mediacom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mediacom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mediacom: Any
  get() = object {
      /** Mediacom M-PPxS5 */
      val M_PPXS5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Mediacom M-PPxS7 */
      val M_PPXS7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Mediacom M-SP10HXxH */
      val M_SP10HXXH = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Mediacom M-SP10MXHL */
      val M_SP10MXHL = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Mediacom M-SP1AGO3G */
      val M_SP1AGO3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Mediacom M-SP7HXAH */
      val M_SP7HXAH = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Mediacom M-SP7xGO3G */
      val M_SP7XGO3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Mediacom SmartPad */
      val SMARTPAD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Mediacom 10edge */
      val _10EDGE = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Mediacom 1EY4G */
      val _1EY4G = "spec:width=800,height=1280,unit=px,dpi=160"

  }
