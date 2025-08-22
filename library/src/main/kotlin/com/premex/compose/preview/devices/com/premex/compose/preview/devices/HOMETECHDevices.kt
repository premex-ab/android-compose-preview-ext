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
      /** DeviceSpec(manufacturer=HOMETECH, code=ALFA10TB, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMETECH, code=ALFA10TB, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ALFA10TB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HOMETECH, code=ALFA10TX, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMETECH, code=ALFA10TX, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ALFA10TX = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HOMETECH, code=ALFA10TX_PRO, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMETECH, code=ALFA10TX_PRO,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ALFA10TX_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HOMETECH, code=ALFA_10BS, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMETECH, code=ALFA_10BS,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ALFA_10BS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HOMETECH, code=ALFA_10BT, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMETECH, code=ALFA_10BT,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val ALFA_10BT = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=HOMETECH, code=ALFA_10BT_V2, width=1200, height=2000, dpi=340,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMETECH, code=ALFA_10BT_V2,
      width=1200, height=2000, dpi=340, isGoogleDevice=false).code */
      val ALFA_10BT_V2 = "spec:width=1200,height=2000,unit=px,dpi=340"

      /** DeviceSpec(manufacturer=HOMETECH, code=ALFA_10YC, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMETECH, code=ALFA_10YC,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ALFA_10YC = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HOMETECH, code=ALFA_7MRC, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMETECH, code=ALFA_7MRC,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ALFA_7MRC = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HOMETECH, code=ALFA_8SL, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMETECH, code=ALFA_8SL, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ALFA_8SL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HOMETECH, code=ALFA_8ST, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMETECH, code=ALFA_8ST, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ALFA_8ST = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HOMETECH, code=ALFA_8TX, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMETECH, code=ALFA_8TX, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val ALFA_8TX = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=HOMETECH, code=7_PREMIUM_PRO, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMETECH, code=7_PREMIUM_PRO,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val _7_PREMIUM_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

  }
