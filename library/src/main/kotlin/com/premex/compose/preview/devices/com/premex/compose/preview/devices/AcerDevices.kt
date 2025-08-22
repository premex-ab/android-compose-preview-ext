package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * acer device specifications for Android Compose previews.
 *
 * This extension provides acer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Acer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Acer: Any
  get() = object {
      /** DeviceSpec(manufacturer=acer, code=acer_A10M1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_A10M1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ACER_A10M1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=acer, code=acer_A11M1, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_A11M1, width=1200,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val ACER_A11M1 = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=acer, code=acer_A8M1, width=800, height=1340, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_A8M1, width=800,
      height=1340, dpi=213, isGoogleDevice=false).code */
      val ACER_A8M1 = "spec:width=800,height=1340,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=acer, code=acer_aprilia, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_aprilia, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ACER_APRILIA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=acer_apriliahd, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_apriliahd,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ACER_APRILIAHD = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=acer, code=acer_asgard, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_asgard, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ACER_ASGARD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=acer_asgardfhd, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_asgardfhd,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val ACER_ASGARDFHD = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=acer_asgardlte, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_asgardlte,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ACER_ASGARDLTE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=acer_barricade, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_barricade,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val ACER_BARRICADE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=acer, code=acer_barricadewifi, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_barricadewifi,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val ACER_BARRICADEWIFI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=acer, code=acer_barricade_3G, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_barricade_3G,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val ACER_BARRICADE_3G = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=acer, code=acer_c01, width=480, height=640, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_c01, width=480,
      height=640, dpi=240, isGoogleDevice=false).code */
      val ACER_C01 = "spec:width=480,height=640,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=acer_Colnago, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_Colnago, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ACER_COLNAGO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=acer_ColnagoFHD, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_ColnagoFHD,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val ACER_COLNAGOFHD = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=acer_e39, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_e39, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ACER_E39 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=acer, code=acer_FrenzyRefresh, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_FrenzyRefresh,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ACER_FRENZYREFRESH = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=acer, code=acer_harley, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_harley, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ACER_HARLEY = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=acer_harleyfhd, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_harleyfhd,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val ACER_HARLEYFHD = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=acer_jetfirefhd, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_jetfirefhd,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val ACER_JETFIREFHD = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=acer_jetfirehd, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_jetfirehd,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ACER_JETFIREHD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=acer_jetfirelte, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_jetfirelte,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ACER_JETFIRELTE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=acer_P10M2, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_P10M2, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val ACER_P10M2 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=acer_S57, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_S57, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ACER_S57 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=acer, code=acer_T02, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_T02, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ACER_T02 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=acer, code=acer_t03, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_t03, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ACER_T03 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=acer, code=acer_t04, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_t04, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ACER_T04 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=acer, code=acer_t06, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_t06, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ACER_T06 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=acer, code=acer_t07, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_t07, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ACER_T07 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=acer, code=acer_t08, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_t08, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ACER_T08 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=acer, code=acer_t09, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_t09, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ACER_T09 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=acer, code=acer_t10, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_t10, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ACER_T10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=acer, code=acer_t11, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_t11, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ACER_T11 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=acer, code=acer_Titan, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_Titan, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val ACER_TITAN = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=acer_V10M2, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_V10M2, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val ACER_V10M2 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=acer_V11M1, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_V11M1, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val ACER_V11M1 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=acer_Vulcan, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_Vulcan, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ACER_VULCAN = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=acer_X12M1, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_X12M1, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val ACER_X12M1 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=acer, code=acer_z410, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_z410, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ACER_Z410 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=acer_Z500, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_Z500, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ACER_Z500 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=acer, code=acer_z520, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_z520, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ACER_Z520 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=acer_Zipp, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=acer_Zipp, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ACER_ZIPP = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=acer, code=ACTAB1024, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=ACTAB1024, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ACTAB1024 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=ACTAB10KB24, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=ACTAB10KB24, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val ACTAB10KB24 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=ACTAB1123, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=ACTAB1123, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val ACTAB1123 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=ACTAB1422, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=ACTAB1422, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val ACTAB1422 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=ACTAB723, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=ACTAB723, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ACTAB723 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=ACTABKID, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=ACTABKID, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ACTABKID = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=ATAB1024E, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=ATAB1024E, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ATAB1024E = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=ATAB10KB24E, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=ATAB10KB24E, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val ATAB10KB24E = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=ATAB1123E, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=ATAB1123E, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val ATAB1123E = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=ATAB1422E, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=ATAB1422E, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val ATAB1422E = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=ATAB723E, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=ATAB723E, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ATAB723E = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=ATABKD1024K, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=ATABKD1024K, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ATABKD1024K = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=ATLTE1022, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=ATLTE1022, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ATLTE1022 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=ATLTE1022E, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=ATLTE1022E, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ATLTE1022E = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=B1-710, width=600, height=976, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=B1-710, width=600,
      height=976, dpi=160, isGoogleDevice=false).code */
      val B1_710 = "spec:width=600,height=976,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=B1-711, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=B1-711, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val B1_711 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=b1-720, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=b1-720, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val B1_720 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=B1-A71, width=600, height=976, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=B1-A71, width=600,
      height=976, dpi=160, isGoogleDevice=false).code */
      val B1_A71 = "spec:width=600,height=976,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=Battlezone, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=Battlezone, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val BATTLEZONE = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=Battlezone_LTE, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=Battlezone_LTE,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val BATTLEZONE_LTE = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=Baymax, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=Baymax, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val BAYMAX = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=C11, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=C11, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val C11 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=citizen, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=citizen, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CITIZEN = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=acer, code=ducati, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=ducati, width=768,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val DUCATI = "spec:width=768,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=ducati2fhd, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=ducati2fhd, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DUCATI2FHD = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=acer, code=ducati2hd, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=ducati2hd, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val DUCATI2HD = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=acer, code=ducati2hd3g, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=ducati2hd3g, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val DUCATI2HD3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=acer, code=Frontier, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=Frontier, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val FRONTIER = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=mango, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=mango, width=768,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MANGO = "spec:width=768,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=oban, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=oban, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val OBAN = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=omega, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=omega, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val OMEGA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=P11, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=P11, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val P11 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=picasso_e2, width=752, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=picasso_e2, width=752,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PICASSO_E2 = "spec:width=752,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=picasso_m, width=752, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=picasso_m, width=752,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PICASSO_M = "spec:width=752,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=picasso_mf, width=1128, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=picasso_mf, width=1128,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val PICASSO_MF = "spec:width=1128,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=rolex, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=rolex, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ROLEX = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=acer, code=T01, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=T01, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val T01 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=T012, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=T012, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val T012 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=Tattoo, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=Tattoo, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val TATTOO = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=acer, code=Ultimo, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=Ultimo, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val ULTIMO = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=acer, code=vespa, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=vespa, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val VESPA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=acer, code=vespa2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=vespa2, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val VESPA2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=acer, code=vespa8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=vespa8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val VESPA8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=acer, code=vespatn, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=vespatn, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val VESPATN = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=Walle, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=Walle, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val WALLE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=z220, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=z220, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val Z220 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=acer, code=zara, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=zara, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ZARA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=acer, code=ZX, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=acer, code=ZX, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val ZX = "spec:width=320,height=480,unit=px,dpi=160"

  }
