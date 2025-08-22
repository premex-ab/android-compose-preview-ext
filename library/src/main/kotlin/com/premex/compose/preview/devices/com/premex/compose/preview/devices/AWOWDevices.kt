package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AWOW device specifications for Android Compose previews.
 *
 * This extension provides AWOW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AWOW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AWOW: Any
  get() = object {
      /** DeviceSpec(manufacturer=AWOW, code=AWOW_CreaPad_1001, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AWOW, code=AWOW_CreaPad_1001,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val AWOW_CREAPAD_1001 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=AWOW, code=AWOW_CreaPad_1003_EEA, width=1200, height=1920,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AWOW,
      code=AWOW_CreaPad_1003_EEA, width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val AWOW_CREAPAD_1003_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=AWOW, code=CQA1019_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AWOW, code=CQA1019_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CQA1019_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AWOW, code=CreaPad_1005, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AWOW, code=CreaPad_1005,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val CREAPAD_1005 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=AWOW, code=CreaPad_1005_EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AWOW, code=CreaPad_1005_EEA,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val CREAPAD_1005_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=AWOW, code=CreaPad_1009, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AWOW, code=CreaPad_1009,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val CREAPAD_1009 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=AWOW, code=CreaPad_1009S, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AWOW, code=CreaPad_1009S,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val CREAPAD_1009S = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AWOW, code=CreaPad_1009_EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AWOW, code=CreaPad_1009_EEA,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val CREAPAD_1009_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=AWOW, code=CUBTAB_1001, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AWOW, code=CUBTAB_1001, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CUBTAB_1001 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AWOW, code=Funtab_1001, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AWOW, code=Funtab_1001, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val FUNTAB_1001 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AWOW, code=Funtab_1001_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AWOW, code=Funtab_1001_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val FUNTAB_1001_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AWOW, code=Funtab_1003_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AWOW, code=Funtab_1003_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val FUNTAB_1003_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AWOW, code=Funtab_1003_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AWOW, code=Funtab_1003_US,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val FUNTAB_1003_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AWOW, code=Funtab_801_I_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AWOW, code=Funtab_801_I_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val FUNTAB_801_I_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AWOW, code=Funtab_801_K_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AWOW, code=Funtab_801_K_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val FUNTAB_801_K_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AWOW, code=MID_1085_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AWOW, code=MID_1085_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MID_1085_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AWOW, code=MID_1089IPS_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AWOW, code=MID_1089IPS_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val MID_1089IPS_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AWOW, code=MID_789A100_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AWOW, code=MID_789A100_EEA,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val MID_789A100_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AWOW, code=P11_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AWOW, code=P11_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P11_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AWOW, code=UTBook, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AWOW, code=UTBook, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val UTBOOK = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AWOW, code=UTBook_14, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AWOW, code=UTBook_14, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val UTBOOK_14 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AWOW, code=UTBook_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AWOW, code=UTBook_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val UTBOOK_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
