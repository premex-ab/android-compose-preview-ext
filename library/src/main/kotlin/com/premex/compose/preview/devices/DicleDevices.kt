package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dicle device specifications for Android Compose previews.
 *
 * This extension provides Dicle device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dicle.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dicle: Any
  get() = object {
      /** Dicle Dicle_Dtab_Active_S */
      val DICLE_DTAB_ACTIVE_S = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Dicle Dicle_Dtab_Kpad */
      val DICLE_DTAB_KPAD = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** Dicle Dicle_Dtab_U1008 */
      val DICLE_DTAB_U1008 = "spec:width=1280,height=1920,unit=px,dpi=320"

      /** Dicle Dicle_Tab_Lite_M */
      val DICLE_TAB_LITE_M = "spec:width=800,height=1280,unit=px,dpi=210"

      /** Dicle DTABPLUS */
      val DTABPLUS = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Dicle Tab_MyPen_P1 */
      val TAB_MYPEN_P1 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Dicle Tab_Ultra */
      val TAB_ULTRA = "spec:width=1200,height=2000,unit=px,dpi=320"

  }
