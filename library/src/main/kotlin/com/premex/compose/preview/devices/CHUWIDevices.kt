package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CHUWI device specifications for Android Compose previews.
 *
 * This extension provides CHUWI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CHUWI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CHUWI: Any
  get() = object {
      /** CHUWI CH108Q */
      val CH108Q = "spec:width=1212,height=1940,unit=px,dpi=320"

      /** CHUWI Hi10_XPro */
      val HI10_XPRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** CHUWI Hi10_XPro_Pad */
      val HI10_XPRO_PAD = "spec:width=800,height=1280,unit=px,dpi=213"

      /** CHUWI Hi10_XPro_Pad_EEA */
      val HI10_XPRO_PAD_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** CHUWI Hi9 */
      val HI9 = "spec:width=1600,height=2560,unit=px,dpi=360"

      /** CHUWI Hi9Air */
      val HI9AIR = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** CHUWI Hi9Pro */
      val HI9PRO = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** CHUWI HiPadPlus */
      val HIPADPLUS = "spec:width=1600,height=2176,unit=px,dpi=320"

      /** CHUWI HiPadPro */
      val HIPADPRO = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** CHUWI HipadX */
      val HIPADX = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** CHUWI HiPad_11 */
      val HIPAD_11 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** CHUWI HiPad-Air */
      val HIPAD_AIR = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** CHUWI HiPad_Max */
      val HIPAD_MAX = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** CHUWI HiPad_XPro */
      val HIPAD_XPRO = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** CHUWI HiPad_XPro_EEA */
      val HIPAD_XPRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** CHUWI Surpad */
      val SURPAD = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
