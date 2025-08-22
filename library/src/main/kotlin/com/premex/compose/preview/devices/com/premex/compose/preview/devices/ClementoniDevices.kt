package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Clementoni device specifications for Android Compose previews.
 *
 * This extension provides Clementoni device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Clementoni.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Clementoni: Any
  get() = object {
      /** DeviceSpec(manufacturer=Clementoni, code=CLEMPAD10_2023, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Clementoni, code=CLEMPAD10_2023,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val CLEMPAD10_2023 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Clementoni, code=CLEMPAD_2018, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Clementoni, code=CLEMPAD_2018,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val CLEMPAD_2018 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Clementoni, code=Clempad_8, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Clementoni, code=Clempad_8,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val CLEMPAD_8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Clementoni, code=Clempad_9, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Clementoni, code=Clempad_9,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val CLEMPAD_9 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Clementoni, code=ClemPhone_7, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Clementoni, code=ClemPhone_7,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val CLEMPHONE_7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Clementoni, code=MFClempadP_9, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Clementoni, code=MFClempadP_9,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MFCLEMPADP_9 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Clementoni, code=MFClempad_9, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Clementoni, code=MFClempad_9,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val MFCLEMPAD_9 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Clementoni, code=MFC_2018, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Clementoni, code=MFC_2018,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val MFC_2018 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Clementoni, code=MFC_7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Clementoni, code=MFC_7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MFC_7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Clementoni, code=MFC_8, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Clementoni, code=MFC_8, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MFC_8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Clementoni, code=Neo_Clempad_2021, width=800, height=1280,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Clementoni,
      code=Neo_Clempad_2021, width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val NEO_CLEMPAD_2021 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
