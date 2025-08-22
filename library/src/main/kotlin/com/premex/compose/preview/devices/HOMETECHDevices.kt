package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HOMETECH device specifications for Android Compose previews.
 *
 * This extension provides HOMETECH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HOMETECH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HOMETECH: Any
  get() = object {
      /** HOMETECH ALFA10TB */
      val ALFA10TB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HOMETECH ALFA10TX */
      val ALFA10TX = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HOMETECH ALFA10TX_PRO */
      val ALFA10TX_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HOMETECH ALFA_10BS */
      val ALFA_10BS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HOMETECH ALFA_10BT */
      val ALFA_10BT = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** HOMETECH ALFA_10BT_V2 */
      val ALFA_10BT_V2 = "spec:width=1200,height=2000,unit=px,dpi=340"

      /** HOMETECH ALFA_10YC */
      val ALFA_10YC = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HOMETECH ALFA_7MRC */
      val ALFA_7MRC = "spec:width=600,height=1024,unit=px,dpi=160"

      /** HOMETECH ALFA_8SL */
      val ALFA_8SL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HOMETECH ALFA_8ST */
      val ALFA_8ST = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HOMETECH ALFA_8TX */
      val ALFA_8TX = "spec:width=800,height=1280,unit=px,dpi=200"

      /** HOMETECH 7_PREMIUM_PRO */
      val _7_PREMIUM_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

  }
